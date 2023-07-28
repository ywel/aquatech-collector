package io.aquatech.comms;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class UdpClient {

	static final Logger logger = LoggerFactory.getLogger(UdpClient.class);
	private DatagramSocket socket;
		 
	    public  void sendData(String message) {
	       
	        String hostname = "164.92.211.35"; //"dev.float-iot.nl";
	        int port =15682;
	 
	        try {
	            InetAddress address = InetAddress.getByName(hostname);
	             socket = new DatagramSocket();
	            byte[] buf;

	            

	      
	            
	            buf = hexStringToByteArray(message);
	            DatagramPacket packet 
	              = new DatagramPacket(buf, buf.length, address, port);
	            socket.send(packet);
	            
	            byte[] buffer = new byte[20];
                DatagramPacket response = new DatagramPacket(buffer, buffer.length);
                socket.receive(response);
 
	 
	         
	         
	         logger.info("float Response "+ convertByteToHexadecimal(buffer));
	 
	                
	               
	        } catch (SocketTimeoutException ex) {
	          logger.error("UDP Timeout error: " + ex.getMessage());
	            ex.printStackTrace();
	        } catch (IOException ex) {
	        	logger.error("UDP Client error: " + ex.getMessage());
	            ex.printStackTrace();
	        } 
	        finally {
	        	socket.close();
	        	
	        	 logger.info("float Response socket closed ");
	        	
			}
	    }
	    

	
	 private static byte[] hexStringToByteArray(String s) {
	        int len = s.length();
	        byte[] data = new byte[len / 2];
	        for (int i = 0; i < len; i += 2) {
	            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                                 + Character.digit(s.charAt(i+1), 16));
	        }
	        return data;
	    }
	 
	 private static String convertByteToHexadecimal(byte[] byteArray)
	    {
	        String hex = "";
	  
	        // Iterating through each byte in the array
	        for (byte i : byteArray) {
	            hex += String.format("%02X", i);
	        }
	  
	        System.out.print(hex);
	        
	        return hex;
	    }

}
