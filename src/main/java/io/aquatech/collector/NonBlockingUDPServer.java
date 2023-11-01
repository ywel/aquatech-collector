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

import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bugsnag.Bugsnag;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huawei.m2m.cig.tup.modules.protocol_adapter.IProtocolAdapter;
import com.huizhong.codec.huizhong.ProtocolAdapterImpl;
import com.huizhong.codec.util.DataTypeUtil;

import io.aquatech.kafka.Producer;

public class NonBlockingUDPServer {
    private static final int PORT = 7058;
    private static final int THREAD_POOL_SIZE = 10;
    static byte[] ackBinary;
	Producer kafkaProducer = new Producer();

    
	private static final Logger logger = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        System.setProperty("mail.smtp.starttls.enable", "false");

        Bugsnag bugsnag = new Bugsnag("42e7e984d4bf059b30f1b7ee4e9a3303");


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
            logger.error(e.getMessage());
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
               byte[] responseBytes= processClientMessage(clientMessageBytes);
                ByteBuffer responseBuffer = ByteBuffer.wrap(responseBytes);
                
                readChannel.send(responseBuffer, clientAddress);
                
                
                buffer.clear();
                responseBuffer.clear();
                
                
                 writeToQueue(clientMessageBytes);
        
            } else {
               // System.out.println("Received a null client address.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        	buffer.clear();
           
		}
    }
    
    private static byte[] processClientMessage(byte[] clientMessageBytes) throws Exception {
    	
    	
    	   
        char[] clientMessageHex = Hex.encodeHex(clientMessageBytes, true);
        
        String hex = new String(clientMessageHex);
		String cleahex = hex.substring(0, hex.lastIndexOf("16") + 2);
		IProtocolAdapter adapter = new ProtocolAdapterImpl();
      
    	
    	   ObjectNode result = adapter.decode(DataTypeUtil.parseHexStr2ByteArr(cleahex));

    				String	jsonString = result.toString();

    					IProtocolAdapter adapter2 = new ProtocolAdapterImpl();
    					ObjectMapper mapper2 = new ObjectMapper();
    					ObjectNode ackParams = mapper2.createObjectNode();

    					ackParams.put("identifier", result.get("identifier"));// Unique identifier of the device
    					ackParams.put("msgType", "cloudRsp");// Message type, Fixed transmission cloudRsp
    					ackParams.put("hasMore", 0);// Fixed 0
    					ackParams.put("errcode", 0);// Fixed 0
    					ackParams.put("request", DataTypeUtil.parseHexStr2ByteArr(cleahex));
    			        byte[] responseBytes = adapter2.encode(ackParams);

        return responseBytes;
    }

  private static void writeToQueue(byte[] clientMessageBytes) throws Exception {
	  
	  
	   
      char[] clientMessageHex = Hex.encodeHex(clientMessageBytes, true);
      
      String hex = new String(clientMessageHex);
		String cleahex = hex.substring(0, hex.lastIndexOf("16") + 2);
		IProtocolAdapter adapter = new ProtocolAdapterImpl();
    
  	
  	   ObjectNode result = adapter.decode(DataTypeUtil.parseHexStr2ByteArr(cleahex));

  				String	jsonString = result.toString();
	  
	  Producer kafkaProducer = new Producer();

		
		kafkaProducer.writeToTopic("hz_telemetry", "hz_telemetry", cleahex);


		if (jsonString.contains("swVersion")) {


			try {
				kafkaProducer.writeToTopic("readings", "readings", jsonString);


			} catch (Exception exwrite) {

				logger.error(exwrite.getMessage());
				
				
			}

		} else {

			try {

				kafkaProducer.writeToTopic("alarms", "alarms", jsonString);


			} catch (Exception exwrite1) {

				logger.error(exwrite1.getMessage());
			}

			//SendAlarms.sendData(jsonString);
		}
		
	  
  }
}
