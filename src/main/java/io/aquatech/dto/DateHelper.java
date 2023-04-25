package io.aquatech.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
	 public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
	 public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 
	 
	public String processDate(String rawDate,String pattern){
		String dateString="";
		
		if(rawDate==null) {
			rawDate="19700101T000000Z";
		}
		
			try {
				Date date=fromString(rawDate, pattern);
				dateString=formatDate(date);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
			return dateString;
}
	
				
	 
	 
	     Date fromString(String source, String pattern) throws ParseException {
	        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	        return sdf.parse(source);
	    }
	 
	 
	     String formatDate(Date date) {
	        if (date == null) {
	            return "";
	        } else {
	            return DATE_FORMAT.format(date);
	        }
	    }

}
