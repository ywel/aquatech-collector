package io.aquatech.comms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.aquatech.billing.Datum;
import io.aquatech.billing.Services;
import io.aquatech.billing.SulisReading;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.slf4j.Logger;

public class SendBillingInfo {

	static final Logger logger = LoggerFactory.getLogger(SendBillingInfo.class);
	
	static final	ObjectMapper mapper=new ObjectMapper();
	
	private static String authenticate() {
		String token = null;
		String url="http://upepoapi.sulis.co.ke/createtoken.php";
		Map<String, String> map = new HashMap<>();
		map.put("name", "mmeterreading");
		map.put("email", "mreading@gmail.com");
		map.put("key", "123uppp@3029");
		
		
		
		try {
			String jsonContent=mapper.writeValueAsString(map);
			
	

	OkHttpClient client = new OkHttpClient().newBuilder()
			  .build();
			
	MediaType mediaType = MediaType.parse("application/json");
			RequestBody body = RequestBody.create(
					jsonContent,
					mediaType);
			
			Request request = new Request.Builder()
			  .url(url)
			  .method("POST", body)
			  .addHeader("Content-Type", "application/json")
			  .build();
			try {
				Response response = client.newCall(request).execute();
				
				token=response.body().string();
				logger.info(token);
				
				
			} 
			catch (IOException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return token;
						
	}
	
	
		public static void notifySulis(String eventTime,String zoneId,String reading ,String metercode) {
		
			String url = "http://smartmeter.sulis.co.ke/process.php";
		
			String token=authenticate();
		 
			SulisReading sulisReading =new SulisReading();
						
			Services services=new Services();
			
			Datum datum=new Datum();
			
			List<Datum> data =new ArrayList<>();
			
			datum.setReading(reading);
			datum.setMetercode(metercode);
			data.add(datum);
			services.setEventTime(eventTime);
			services.setData(data);
			services.setServiceId("WaterMeter");
			services.setServiceType("WaterMeter");
			
			
			
			sulisReading.setNotifyType("deviceDatasChanged");
			sulisReading.setObjectcount("0");
			sulisReading.setServices(services);
			sulisReading.setWsp("eldowas");
			sulisReading.setZone(zoneId);
			
		String dataStr;
		try {
			dataStr = mapper.writeValueAsString(sulisReading);
			sendData(dataStr,url,token);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		 
		 	
		
	}
	


	public static void sendData(String jsonContent,String url,String token) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		

		
		Runnable runnable = () -> {
			logger.info("Staring a Runnable...");
			
			
			
			OkHttpClient client = new OkHttpClient().newBuilder()
					  .build();
					
			MediaType mediaType = MediaType.parse("application/json");
					RequestBody body = RequestBody.create(
							jsonContent,
							mediaType);
					
					Request request = new Request.Builder()
					  .url(url)
					  .method("POST", body)
					  .addHeader("php_token",token)
					  .addHeader("php_key", "123uppp@3029")
					  .addHeader("Content-Type", "application/json")
					  .build();
					try {
						Response response = client.newCall(request).execute();
						
						
						logger.info("Send Billing info Response "+response.body().string());
						
						
					} 
					catch (IOException e) {
						e.printStackTrace();
					}catch(Exception e) {
						e.printStackTrace();
						
					}
					
							
					logger.info("Ending a Runnable...");
		

		};

		executorService.submit(runnable);

		executorService.shutdown();

	}

}
