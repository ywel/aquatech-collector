package io.aquatech.collector;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dater {
	
	public static void main(String[] args) {
		
		try {
	Date date=fromString("20221110T151018Z", "yyyyMMdd'T'HHmmss'Z'");
	System.out.println(formatDate(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
	 public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	    public static Date fromString(String source, String pattern) throws ParseException {
	        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	        return sdf.parse(source);
	    }

	    public static Date parseDateTime(String dateStr) {
	        try {
	            return DATE_TIME_FORMAT.parse(dateStr);
	        } catch (ParseException e) {
	           e.printStackTrace();
	           
	           return null;
	        }
	    }

	    public static Date parseDate(String dateStr) {
	        try {
	            return DATE_FORMAT.parse(dateStr);
	        } catch (ParseException e) {
		           e.printStackTrace();

	            return null;
	        }
	    }

	    public static String formatDateTime(Date date) {
	        if (date == null) {
	            return "";
	        } else {
	            return DATE_TIME_FORMAT.format(date);
	        }
	    }

	    public static String formatDate(Date date) {
	        if (date == null) {
	            return "";
	        } else {
	            return DATE_FORMAT.format(date);
	        }
	    }
	

}
