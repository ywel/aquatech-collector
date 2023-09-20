package io.aquatech.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.*;

public class ByteSplitter {

    public static void main(String[] args) {
        String input = "681051270000207568991c7002012b805300002b150600002b00000000350000000045240000003703122908232000001200001504000015040000150400001504000015040000150400001504000015040000150400001504000015040000150400001504000015040000150400001504000014fe000014fb000014f3000014f1000014810000143f000013e7000013ca0000137600001369000013690000136900001369000013690000136900001369000013690000136900001369000013690000136900001369000013690000136900001369000013690000136900001369000013690000136900001369000013696537010688110f3500282109000982010666070301002e89254014000108307506086620705428931306390140008307500100ffffff4e16fdfdfd0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"; // Example input string
        
        String[] result = splitBytes(input);
        
        for (String segment : result) {
            System.out.println(segment);
        }
    }
    
    public static String[] splitBytes(String input) {
        if (input.length() < 20) {
            throw new IllegalArgumentException("Input string is too short.");
        }
        
        String sof = input.substring(0, 2);
        String meterType = input.substring(2, 4);
        String addressField = input.substring(4, 18);
        String controlCode = input.substring(18, 20);
        String dataLength = input.substring(20, 22);
        String dataIdentification = input.substring(22, 26);
        String serialNumber = input.substring(26, 28);
        String dataCode =input.substring(28,30);
        String flow=input.substring(30,38);
        String DflowCode=input.substring(38,40);
        String settlementDayCumulative =input.substring(40,48);
        String reverseFlowCode=input.substring(48,50);
        String revrseFlow=input.substring(50,58);
        String instantenousFlowCode=input.substring(58,60);
        String instantenousFlow=input.substring(60,68);
        String temprature=mirror(input.substring(68,74));
        String pressure=input.substring(74,78);
        String tableTime=mirror(input.substring(78,92));
        String tableStatusCode=input.substring(92,96);
        String lastFrozenPointInTime=input.substring(96,98);
        String lastFrozenPointInTimeStart=input.substring(98,482);
        String batteryVoltage=input.substring(482,486);
        
        String tail=(input.substring(92,92));
        
        
        
        HashMap<String, String> result=   splitStringIntoChunks(lastFrozenPointInTimeStart,18,convertToHumanReadableDate(tableTime,"yyyy-MM-dd"));
        
        
        for (String hour : result.keySet()) {
            System.out.println("Hour: " + (hour) + " | Chunk: " + result.get(hour));
        }
        
       // int dataLengthValue = Integer.parseInt(dataLength, 16) * 2;
        String data = input.substring(22, 26 + 56);
        
        //String checkDigit = input.substring(28 + dataLengthValue, 30 + dataLengthValue);
        //String tail = input.substring(92 + dataLengthValue);
        
        HashMap<String, String> telemetry = new HashMap<String, String>();
        
        telemetry.put("sof", sof);
        telemetry.put("meterType", "meterType");
        telemetry.put("meterNumber", mirror(addressField));
        telemetry.put("cummulativeFlowUnit", dataCode);
        telemetry.put("cummulativeFlow", flow);
        telemetry.put("settlementDaycummulativeFlowCode", DflowCode);
        telemetry.put("settlementDaycummulativeFlow", settlementDayCumulative);
        telemetry.put("reverseFlowCode", reverseFlowCode);
        telemetry.put("reverseFlow", revrseFlow);
        telemetry.put("instantenousFlowCode", instantenousFlowCode);
        telemetry.put("instantenousFlow", instantenousFlow);
        telemetry.put("temperature", temprature);
        telemetry.put("tableTime", tableTime);
        telemetry.put("lastFrozenPointInTime", lastFrozenPointInTime);
        telemetry.put("batteryVoltage",batteryVoltage);
        
        return new String[]{"sof: "+sof, "meterType: "+meterType, "meterNumber: "+mirror(addressField), "controlCode: "+controlCode, 
        		"dataLength: "+dataLength, "dataIdentification: "+dataIdentification, "serialNumber: "+serialNumber,"cummulativeFlowUnit: "+dataCode,"cummulativeFlow: "+flow,"Settlement day cumulative volume unit: "+DflowCode,"settlementDayCumulative: "+settlementDayCumulative,"reverseFlowCode: "+reverseFlowCode,"reverseFlow: "+revrseFlow,"instantenousFlowCode: "+instantenousFlowCode,"instantenousFlow: "+instantenousFlow
        		,"temperature: "+temprature,"pressure: "+pressure,"tableTime: "+convertToHumanReadableDate(tableTime),"tableStatusCode: "+tableStatusCode,"lastFrozenPointInTime: "+lastFrozenPointInTime,"lastFrozenPointInTimeStart: "+lastFrozenPointInTimeStart,"Data: "+data ,"Batery Voltage: "+batteryVoltage,tail};
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
        LocalDateTime initialDateTime = createDateTime(startDate, formatHour(startHour+1));
        
        for (int i = 0; i < input.length(); i += 8) {
        	
            String chunk = input.substring(i, i + 8);
            initialDateTime = incrementHour(initialDateTime);
            resultMap.put(formatDateTime(initialDateTime), chunk);
            
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
    
    public static String formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return dateTime.format(formatter);
    }
    
    public static LocalDateTime createDateTime(String dateStr, String timeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateStr + " " + timeStr, formatter);
        return dateTime;
    }
    public static LocalDateTime incrementHour(LocalDateTime dateTime) {
        return dateTime.minus(1, ChronoUnit.HOURS);
    }
    
    public static String formatHour(int hour) {
        return String.format("%02d:00", hour%24);
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

    public static String convertToHumanReadableDate(String input) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            
            Date date = inputFormat.parse(input);
            String output = outputFormat.format(date);
            
            return output;
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid input format";
        }
   
    }
    

    public static String convertToHumanReadableDate(String input,String formart) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            SimpleDateFormat outputFormat = new SimpleDateFormat(formart);
            
            Date date = inputFormat.parse(input);
            String output = outputFormat.format(date);
            
            return output;
        } catch (ParseException e) {
            e.printStackTrace();
            return "Invalid input format";
        }
   
    }
}
