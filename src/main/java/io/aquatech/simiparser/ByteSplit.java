package io.aquatech.simiparser;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.aquatech.test.HourlyReading;
import io.aquatech.test.MeterReading;

public class ByteSplit {
	
	
	public static String splitHex(String input) {
        if (input.length() < 20) {
            throw new IllegalArgumentException("Input string is too short.");
        }
        
        String sof = input.substring(0, 2);
        String meterType = input.substring(2, 4);
        String addressField = mirror( input.substring(4, 18));
        String controlCode = input.substring(18, 20);
        String dataLength = input.substring(20, 22);
        String dataIdentification = input.substring(22, 26);
        String serialNumber = input.substring(26, 28);
        String dataCode =input.substring(28,30);
        String flow=mirror(input.substring(30,38));
        String DflowCode=input.substring(38,40);
        String settlementDayCumulative =mirror(input.substring(40,48));
        String reverseFlowCode=input.substring(48,50);
        String revrseFlow=mirror(input.substring(50,58));
        String instantenousFlowCode=input.substring(58,60);
        String instantenousFlow=mirror(input.substring(60,68));
        String temprature=mirror(input.substring(68,74));
        String pressure=input.substring(74,78);
        String tableTime=mirror(input.substring(78,92));
        String tableStatusCode=input.substring(92,96);
        String lastFrozenPointInTime=input.substring(96,98);
        String lastFrozenPointInTimeStart=input.substring(98,482);
        String batteryVoltage=mirror(input.substring(482,486));
        
        String tail=(input.substring(92,92));
        
        MeterReading meterReading= new MeterReading();
        
        meterReading.setSettlementDaycummulativeFlow(Double.parseDouble(settlementDayCumulative)*0.001);
        meterReading.setSettlementDaycummulativeFlowCode(DflowCode);
        meterReading.setBatteryVoltage(Double.parseDouble(batteryVoltage)*0.001);
        meterReading.setCummulativeFlow(Double.parseDouble(flow)*0.001);
        meterReading.setCummulativeFlowUnit(DflowCode);
        meterReading.setInstantenousFlow(Double.parseDouble(instantenousFlow)*0.001);
        meterReading.setInstantenousFlowCode(instantenousFlowCode);
        meterReading.setLastFrozenPointInTime(lastFrozenPointInTime);
        meterReading.setMeterNumber(addressField);
        meterReading.setMeterType(meterType);
        meterReading.setReverseFlow(Double.parseDouble(revrseFlow)*0.001);
        meterReading.setInstantenousFlowCode(instantenousFlowCode);
        meterReading.setSettlementDaycummulativeFlow(Double.parseDouble(settlementDayCumulative)*0.001);
        meterReading.setSettlementDaycummulativeFlowCode(settlementDayCumulative);
        meterReading.setSof(sof);
        meterReading.setTableTime(tableTime);
        meterReading.setTemperature(Double.parseDouble(temprature)*0.01);
        meterReading.setReverseFlowCode(reverseFlowCode);
        
        
 
        HashMap<String, String> result=   splitStringIntoChunks(lastFrozenPointInTimeStart,18,DateOperations.convertToHumanReadableDate(tableTime,"yyyy-MM-dd"));
        
        ArrayList<HourlyReading> hourlyReadings =new ArrayList<HourlyReading>();
        
        for (String hour : result.keySet()) {
        	
        	HourlyReading hourlyReading=new HourlyReading();
        	
        	hourlyReading.setDateTime(hour);
        	hourlyReading.setReading(hexToDecimal( result.get(hour))*0.001);
        	
            System.out.println("Hour: " + (hour) + " | Chunk: " +hexToDecimal( result.get(hour)));
            
            hourlyReadings.add(hourlyReading);
        }
        
        meterReading.setHourlyReadings(hourlyReadings);

        
       // int dataLengthValue = Integer.parseInt(dataLength, 16) * 2;
    //    String data = input.substring(22, 26 + 56);
        
        //String checkDigit = input.substring(28 + dataLengthValue, 30 + dataLengthValue);
        //String tail = input.substring(92 + dataLengthValue);
        
        HashMap<String, String> telemetry = new HashMap<String, String>();
        
        telemetry.put("sof", sof);
        telemetry.put("meterType", "meterType");
        telemetry.put("meterNumber", mirror(addressField));
        telemetry.put("cummulativeFlowUnit", dataCode);
        telemetry.put("cummulativeFlow", mirror(flow));
        telemetry.put("settlementDaycummulativeFlowCode", DflowCode); // 2b 0.001
        telemetry.put("settlementDaycummulativeFlow",  mirror(settlementDayCumulative));
        telemetry.put("reverseFlowCode", reverseFlowCode);
        telemetry.put("reverseFlow", revrseFlow);
        telemetry.put("instantenousFlowCode", instantenousFlowCode);
        telemetry.put("instantenousFlow",  mirror(instantenousFlow));
        telemetry.put("temperature",  mirror(temprature));
        telemetry.put("tableTime", tableTime);
        telemetry.put("lastFrozenPointInTime", lastFrozenPointInTime);
        telemetry.put("batteryVoltage", mirror(batteryVoltage));
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        

        // Create an ObjectNode to represent the JSON object
        ObjectNode jsonNode = objectMapper.createObjectNode();

        // Populate the ObjectNode with the HashMap values
        for (Map.Entry<String, String> entry : telemetry.entrySet()) {
            jsonNode.put(entry.getKey(), entry.getValue());
        }

        // Convert the ObjectNode to a JSON string
        String json = null;
		try {
			json = objectMapper.writeValueAsString(meterReading);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // Print the JSON representation
		
			
        return json;
        
//        
//        return new String[]{"sof: "+sof, "meterType: "+meterType, "meterNumber: "+mirror(addressField), "controlCode: "+controlCode, 
//        		"dataLength: "+dataLength, "dataIdentification: "+dataIdentification, "serialNumber: "+serialNumber,"cummulativeFlowUnit: "+dataCode,"cummulativeFlow: "+flow,"Settlement day cumulative volume unit: "+DflowCode,"settlementDayCumulative: "+settlementDayCumulative,"reverseFlowCode: "+reverseFlowCode,"reverseFlow: "+revrseFlow,"instantenousFlowCode: "+instantenousFlowCode,"instantenousFlow: "+instantenousFlow
//        		,"temperature: "+temprature,"pressure: "+pressure,"tableTime: "+convertToHumanReadableDate(tableTime),"tableStatusCode: "+tableStatusCode,"lastFrozenPointInTime: "+lastFrozenPointInTime,"lastFrozenPointInTimeStart: "+lastFrozenPointInTimeStart,"Data: "+data ,"Batery Voltage: "+ mirror(batteryVoltage),tail};
    }
	
    public static String mirror(String input) {
        int length = input.length();
        StringBuilder reversedConcatenated = new StringBuilder();

        for (int i = length - 2; i >= 0; i -= 2) {
            reversedConcatenated.append(input.substring(i, i + 2));
        }

       
        return reversedConcatenated.toString();
    }
    
    public static HashMap<String, String> splitStringIntoChunks(String input, int startHour,String startDate) {
        HashMap<String, String> resultMap = new HashMap<>();
        LocalDateTime initialDateTime = DateOperations.createDateTime(startDate, DateOperations.formatHour(startHour+1));
        
        for (int i = 0; i < input.length(); i += 8) {
        	
            String chunk = input.substring(i, i + 8);
            initialDateTime = DateOperations.incrementHour(initialDateTime);
            resultMap.put(DateOperations.formatDateTime(initialDateTime), chunk);
            
        }

        return resultMap;
    }
    
    public static Set<String> splitStringIntoChunks(String input) {
        Set<String> list = new HashSet<>();
        
        for (int i = 0; i < input.length(); i += 8) {
        	
            String chunk = input.substring(i, i + 8);
            list.add(chunk);
            
        }

        return list;
    }
	
	 public static int hexToDecimal(String hex) {
	        try {
	            // Remove any "0x" prefix if present
	            hex = hex.replaceAll("^0x", "");
	            
	            // Parse the hexadecimal string as an integer with base 16
	            int decimalValue = Integer.parseInt(hex, 16);
	            
	            return decimalValue;
	        } catch (NumberFormatException e) {
	            // Handle invalid input gracefully
	            throw new IllegalArgumentException("Invalid hexadecimal string: " + hex);
	        }
	    }
	    
	    public static int bcdToDecimal(String bcd) {
	        int decimal = 0;
	        int base = 1;
	        
	        for (int i = bcd.length() - 1; i >= 0; i--) {
	            char digitChar = bcd.charAt(i);
	            int digitValue = digitChar - '0'; // Convert char to integer
	            
	            decimal += digitValue * base;
	            base *= 2; // BCD uses base 2 for each digit
	        }
	        
	        return decimal;
	    }

}
