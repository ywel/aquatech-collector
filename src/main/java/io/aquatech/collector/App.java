package io.aquatech.collector;

import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;
import io.aquatech.kafka.Producer;
import io.aquatech.simiparser.ByteSplit;

public class App {
	public final static int SERVICE_PORT =43275;
	private static ThreadedUDPServer server;
		
    static final Logger logger = Logger.getLogger(App.class);


	static byte[] ackBinary;
	

	public static void main(String[] args) {

		server = new ThreadedUDPServer(SERVICE_PORT);

		server.receive(new PacketHandler() {

			@Override
			public void process(Packet packet) {
				char[] data = Hex.encodeHex(packet.getData(), true);
				String hex = new String(data);
				//logger.info("Raw Hex From Client " + hex);
				
				// write to kafka server 
				
				
				Producer kafkaProducer = new Producer();
				
				   String prefix = "fefefe";

			        if (hex.startsWith(prefix)) {
			            // Remove the prefix
			        	logger.info(hex);
			        	
			        	String cleanhex=hex.substring(prefix.length());
			        	
			     String telemetry=ByteSplit.splitHex(cleanhex);
			     
			     logger.info("telemetry "+telemetry);
			        	
			        	kafkaProducer.writeToTopic("simi_telemetry", "simi_telemetry", telemetry );
			        } else {
			            logger.info(hex);
			        }
			    
				
				
					
			}
		});
		
	}


	
	
}
