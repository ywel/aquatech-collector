package io.aquatech.simiparser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateOperations {
	
	   
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
