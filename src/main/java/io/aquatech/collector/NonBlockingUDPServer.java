package io.aquatech.collector;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Selector;
import java.nio.channels.SelectionKey;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.aquatech.kafka.Producer;
import io.aquatech.simiparser.ByteSplit;

public class NonBlockingUDPServer {
    private static final int PORT = 43275;
    private static final int THREAD_POOL_SIZE = 10;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        

        try {
            DatagramChannel channel = DatagramChannel.open();
            channel.bind(new InetSocketAddress(PORT));
            channel.configureBlocking(false);
            

            Selector selector = Selector.open();
            channel.register(selector, SelectionKey.OP_READ);

            System.out.println("Non-blocking UDP server with thread pool is running on port " + PORT);

            while (true) {
                int readyChannels = selector.select();
                if (readyChannels == 0) {
                    continue;
                }

                Set<SelectionKey> selectedKeys = selector.selectedKeys();
                Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
                
                while (keyIterator.hasNext()) {
                    SelectionKey key = keyIterator.next();

                    if (key.isReadable()) {
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

    // Rest of the code as before...

    private static void handleClientRequest(SelectionKey key) {
    	
    	
    	
        DatagramChannel readChannel = (DatagramChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        InetSocketAddress clientAddress;
        try {
            clientAddress = (InetSocketAddress) readChannel.receive(buffer);

            if (clientAddress != null) {
            	
            	
                buffer.flip();
                byte[] clientMessageBytes = new byte[buffer.remaining()];
                buffer.get(clientMessageBytes);
                String clientMessageHex = bytesToHex(clientMessageBytes);

                System.out.println("Received message from client: " +" : "+clientAddress +"--"+ clientMessageHex);

                String responseHex = processClientMessage(clientMessageBytes);
                byte[] responseBytes = hexToBytes(responseHex);
                ByteBuffer responseBuffer = ByteBuffer.wrap(responseBytes);
                readChannel.send(responseBuffer, clientAddress);
                
               
                buffer.clear();
        
            } else {
               // System.out.println("Received a null client address.");
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
