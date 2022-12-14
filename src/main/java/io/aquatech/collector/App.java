package io.aquatech.collector;

import org.apache.commons.codec.binary.Hex;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huawei.m2m.cig.tup.modules.protocol_adapter.IProtocolAdapter;
import com.huizhong.codec.huizhong.ProtocolAdapterImpl;
import com.huizhong.codec.util.DataTypeUtil;

import io.aquatech.comms.SendAlarms;
import io.aquatech.comms.SendBillingInfo;
import io.aquatech.comms.SendTelemetry;
import org.apache.log4j.Logger;

public class App {
	public final static int SERVICE_PORT = 7058;
	private static ThreadedUDPServer server;
		
    static final Logger logger = Logger.getLogger(App.class);


	static byte[] ackBinary;
	
	private static String jsonString;

	public static void main(String[] args) {

		server = new ThreadedUDPServer(SERVICE_PORT);

		server.receive(new PacketHandler() {

			@Override
			public void process(Packet packet) {
				char[] data = Hex.encodeHex(packet.getData(), true);
				String hex = new String(data);
				logger.debug("Raw Hex From Client " + hex);
				String cleahex = hex.substring(0, hex.lastIndexOf("16") + 2);
				
				IProtocolAdapter adapter = new ProtocolAdapterImpl();
				
				if(!(hex.toLowerCase().startsWith("2a00"))) {
					logger.info("Processing Telemetry Received from the client: " + cleahex);
				try {
					ObjectNode result = adapter.decode(DataTypeUtil.parseHexStr2ByteArr(cleahex));
					
					jsonString=result.toString();

					IProtocolAdapter adapter2 = new ProtocolAdapterImpl();
					ObjectMapper mapper2 = new ObjectMapper();
					ObjectNode ackParams = mapper2.createObjectNode();

					ackParams.put("identifier", result.get("identifier"));// Unique identifier of the device
					ackParams.put("msgType", "cloudRsp");// Message type, Fixed transmission cloudRsp
					ackParams.put("hasMore", 0);// Fixed 0
					ackParams.put("errcode", 0);// Fixed 0
					ackParams.put("request", DataTypeUtil.parseHexStr2ByteArr(cleahex));
										
					ackBinary = adapter2.encode(ackParams);

				} catch (Exception e) {
					
					logger.error(e.getMessage());
				}

				ThreadedUDPServer.CLIENTS.add(packet.getConnection());
				server.send(new Packet(ackBinary, packet.getAddr(), packet.getPort()));
				packet = null;								
				//write to kafka 
				//sendData(jsonString);				
            	if(jsonString.contains("swVersion")) {
            		
            		SendTelemetry.sendData(jsonString);
            		           	            		
            	}else {
            		
            		SendAlarms.sendData(jsonString);
            	}

				

			}
				
			}
		});
		
	}


	
	
}
