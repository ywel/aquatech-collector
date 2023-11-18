package io.aquatech.collector;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SelectionKey;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import io.aquatech.kafka.Producer;
import io.aquatech.simiparser.ByteSplit;

public class NonBlockingUDPServer {
    private static final int PORT = 43275;
    private static final int THREAD_POOL_SIZE = 10;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        try {
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.bind(new InetSocketAddress(PORT));
            serverChannel.configureBlocking(false);

            Selector selector = Selector.open();
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);

            System.out.println("Non-blocking TCP server with thread pool is running on port " + PORT);

            while (true) {
                int readyChannels = selector.select();
                if (readyChannels == 0) {
                    continue;
                }

                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectedKeys.iterator();

                while (keyIterator.hasNext()) {
                    SelectionKey key = keyIterator.next();

                    if (key.isAcceptable()) {
                        SocketChannel clientChannel = serverChannel.accept();
                        clientChannel.configureBlocking(false);
                        clientChannel.register(selector, SelectionKey.OP_READ);
                    } else if (key.isReadable()) {
                        threadPool.execute(() -> handleClientRequest(key));
                    }

                    keyIterator.remove();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }

    private static void handleClientRequest(SelectionKey key) {
        SocketChannel readChannel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        try {
            int bytesRead = readChannel.read(buffer);

            if (bytesRead != -1) {
                buffer.flip();
                byte[] clientMessageBytes = new byte[buffer.remaining()];
                buffer.get(clientMessageBytes);
                String clientMessageHex = bytesToHex(clientMessageBytes);

                System.out.println("Received message from client: " + clientMessageHex);

                String responseHex = processClientMessage(clientMessageBytes);
                byte[] responseBytes = hexToBytes(responseHex);
                ByteBuffer responseBuffer = ByteBuffer.wrap(responseBytes);
                readChannel.write(responseBuffer);

                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private static String processClientMessage(byte[] clientMessageBytes) {
       
    		String hex=bytesToHex(clientMessageBytes);
    		Producer kafkaProducer = new Producer();
    		
			   String prefix = "fefefe";

    			
    	 if (hex.startsWith(prefix)) {
	           
	        	String cleanhex=hex.substring(prefix.length());
	        	
	     String telemetry=ByteSplit.splitHex(cleanhex);
	     
	        	kafkaProducer.writeToTopic("simi_telemetry", "simi_telemetry", telemetry );
	        } else {
	        }
    	
        return "FEFEFE6810AAAAAAAAAAAAAAA0404A01700997616".toLowerCase();
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder(2 * bytes.length);
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    private static byte[] hexToBytes(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }
}
