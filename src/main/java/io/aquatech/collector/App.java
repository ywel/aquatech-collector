package io.aquatech.collector;

import org.apache.commons.codec.binary.Hex;
import org.apache.log4j.Logger;

public class App {
	public final static int SERVICE_PORT = 7060;
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
				logger.debug("Raw Hex From Client " + hex);
				
						
			}
		});
		
	}


	
	
}
