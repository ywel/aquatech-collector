package io.aquatech.comms;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.HttpResponseBodyPart;
import org.asynchttpclient.HttpResponseStatus;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.aquatech.collector.DateHelper;
import io.aquatech.collector.Telemetry;
import io.aquatech.dto.Datum;
import io.aquatech.dto.HuizongReading;
import io.aquatech.dto.ServiceData;
import io.netty.handler.codec.http.HttpHeaders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendTelemetry {
	
    static final Logger logger = LoggerFactory.getLogger(SendTelemetry.class);
    
    	static String telemetry="{\"identifier\":\"4114713757\",\"msgType\":\"deviceReq\",\"hasMore\":0,\"data\":[{\"serviceId\":\"Meter\",\"serviceData\":{\"timeOfReading\":\"20221117T064833Z\",\"signalStrength\":75,\"dailyActivityTime\":84,\"swVersion\":\"6\",\"batteryVoltage\":3669,\"imsi\":\"639014010002969\",\"meterType\":7,\"originalData\":\"68CB0068D341725737711443230607A60000000F7F69290010400139063348061711224B5400550E100279AC080411EA73E90184101100000000481300000000000000000225000044265E0300000293253C001800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000002D926040006FF06EC061F07950BCF072407377F030443071611221E010737081611221E015837081611221E010F7F170101010060FF00DA0100001600180000001A000002000000080000E316\"}},{\"serviceId\":\"WaterMeter\",\"serviceData\":{\"timeOfReading\":\"20221117T064833Z\",\"internalTemperature\":16,\"dailyUseWaterTime\":0,\"dailyReverseFlow\":0.0,\"cumulativeFlow\":320.76778,\"positiveCumulativeFlow\":320.76778,\"negativeCumulativeFlow\":0.0,\"cumulativeWorkTime\":862,\"dailyFlow\":0.0,\"peakFlowRate\":null,\"peakFlowRateTime\":null,\"lowestFlowRate\":null,\"lowestFlowRateTime\":null,\"peakReverseFlowRate\":null,\"peakReverseFlowRateTime\":null,\"lowestReverseFlowRate\":null,\"lowestReverseFlowRateTime\":null,\"reverseCumulativeWorkTime\":null,\"dailyReverseUseWaterTime\":null,\"rawData\":\"0101010060FF00DA0100001600180000001A0000020000\",\"rawDataNode\":{\"snr\":257,\"version\":\"01\",\"multiReportingCount\":0,\"sendPower\":-160,\"coverageGrade\":0,\"pci\":474,\"bootToNetWork\":0,\"bootToBaseStationConnectedSuccessfully\":22,\"bootToCoreNetworkAttachedSuccessfully\":24,\"bootToIoTPlatformSuccessfullyRegistered\":0,\"currentTimeOrFailedTime\":26,\"reportStateAndReason\":\"Successful\",\"errCode\":\"0200\",\"nmStatus\":null},\"intervalFlow\":[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0],\"flowIntervral\":3600,\"reverseIntervalFlow\":[],\"reverseFlowIntervral\":null,\"temperature\":[17.91, 17.72, 18.23, 29.65, 19.99, 18.28],\"temperatureInterval\":14400,\"pressure\":[],\"pressInteveral\":null}},{\"serviceId\":\"WaterMeterAlarmStatus\",\"serviceData\":{\"timeOfReading\":1668638913,\"lowFlowAlarm\":0,\"highFlowAlarm\":0,\"tamperAlarm\":0,\"lowBatteryAlarm\":0,\"batteryRunOutAlarm\":0,\"highInternalTemperature\":0,\"reverseFlowAlarm\":0,\"highPressureAlarm\":0,\"lowPressureAlarm\":0,\"highTemperatureAlarm\":0,\"lowTemperatureAlarm\":0,\"innerErrorAlarm\":1,\"storageFault\":0,\"waterTempratureSensorFault\":0,\"pressureSensorFault\":0,\"longTimeFlowAlarm\":0,\"pressureMutationAlarm\":0,\"reserveAlarm19\":0,\"reserveAlarm20\":0,\"reserveAlarm21\":0,\"reserveAlarm22\":0,\"reserveAlarm23\":0,\"reserveAlarm24\":0,\"reserveAlarm25\":0,\"reserveAlarm26\":0,\"lowReverseFlowAlarm\":0,\"highReverseFlowAlarm\":0,\"communicationAlarm\":0,\"psmAlarm\":0,\"valveActionAlarm\":0,\"reserveAlarm32\":0,\"innerTempratureSensorFault\":0}},{\"serviceId\":\"WaterMeterAlarm\",\"serviceData\":{\"alarmName\":\"psmAlarm\",\"timestamp\":\"20221116T074304Z\",\"status\":1,\"imei\":null,\"originalData\":null,\"cryptographicData\":null,\"alarmDetail\":null,\"alarmDetailNode\":null}},{\"serviceId\":\"WaterMeterAlarm\",\"serviceData\":{\"alarmName\":\"psmAlarm\",\"timestamp\":\"20221116T083707Z\",\"status\":1,\"imei\":null,\"originalData\":null,\"cryptographicData\":null,\"alarmDetail\":null,\"alarmDetailNode\":null}},{\"serviceId\":\"WaterMeterAlarm\",\"serviceData\":{\"alarmName\":\"psmAlarm\",\"timestamp\":\"20221116T083758Z\",\"status\":1,\"imei\":null,\"originalData\":null,\"cryptographicData\":null,\"alarmDetail\":null,\"alarmDetailNode\":null}}]}";
    public static void main(String args[]) {

		System.out.println(telemetry.indexOf("swVersion"));

		sendData(telemetry);
	}



	
	public static void sendData(String jsonContent) {
		//send to kafka
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Creating a Runnable...");
        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());        
            AsyncHttpClient client = Dsl.asyncHttpClient();
            ObjectMapper mapper=new ObjectMapper();
            HuizongReading reading =new HuizongReading();
 try {
                     

            		reading=mapper.readValue(jsonContent,HuizongReading.class);
            	
            	
			} catch (Exception e) {
				
				
				
				logger.error(e.getMessage());
			}
            
            List<Datum> services = reading.getData();

    		ServiceData meterService = services.get(0).getServiceData();
    		
    		


    		ServiceData watermeterService =services.get(1).getServiceData();

    		ServiceData waterMeterAlarmStatusService  =services.get(2).getServiceData();
    		
    		Telemetry meterData = new Telemetry();
    		
    		DateHelper datehelper=new DateHelper();
    		
    		meterData.setBatteryVoltage(meterService.getBatteryVoltage());
    		meterData.setSignalStrength((meterService.getSignalStrength()));
    		meterData.setMeterCode(reading.getIdentifier());
    		meterData.setDailyUseWaterTime(0);

    		meterData.setCumulativeFlow(watermeterService.getCumulativeFlow());
    		meterData.setPressure("0");
    		meterData.setDailyFlow((watermeterService.getDailyFlow()));
    		meterData.setTimeTaken(datehelper.processDate(watermeterService.getTimeOfReading(),"yyyyMMdd'T'HHmmss'Z'"));
    		meterData.setTemperature(watermeterService.getTemperature().stream().map(String::valueOf)
    				.collect(Collectors.joining(",")));
    		meterData.setCumulativeWorkTime((watermeterService.getCumulativeWorkTime()));
    		meterData.setDailyReverseFlow((watermeterService.getDailyReverseFlow()));
    		//meterData.setDailyReverseUseWaterTime((watermeterService.getDailyReverseUseWaterTime()));
    		meterData.setDailyUseWaterTime((watermeterService.getDailyUseWaterTime()));
    		meterData.setFlowIntervral((watermeterService.getFlowIntervral()));
    		meterData.setInternalTemperature((watermeterService.getInternalTemperature()));
    		meterData.setLowestFlowRateTime(datehelper.processDate(watermeterService.getLowestFlowRateTime(),"yyyyMMdd'T'HHmmss'Z'"));
    		//meterData.setLowestReverseFlowRate(String.valueOf(watermeterService.getLowestFlowRate()));
    		//meterData.setLowestReverseFlowRateTime(String.valueOf(watermeterService.getLowestFlowRateTime()));
    		meterData.setNegativeCumulativeFlow((watermeterService.getNegativeCumulativeFlow()));
    		meterData.setPeakFlowRateTime(datehelper.processDate(watermeterService.getPeakFlowRateTime(),"yyyyMMdd'T'HHmmss'Z'"));
    		//meterData.setPeakReverseFlowRate(String.valueOf(watermeterService.getPeakReverseFlowRate()));
    		//meterData.setPeakReverseFlowRateTime(String.valueOf(watermeterService.getLowestReverseFlowRateTime()));
    		meterData.setPositiveCumulativeFlow((watermeterService.getPositiveCumulativeFlow()));
    		
    		if(watermeterService.getPressInteveral() != null) {
    			meterData.setPressInteveral(watermeterService.getPressInteveral().stream().map(String::valueOf)
    					.collect(Collectors.joining(",")));
    		}
    		
    		
    		meterData.setPressure(
    				watermeterService.getPressure().stream().map(String::valueOf).collect(Collectors.joining(",")));
    		
    
    		
    		meterData.setTemperatureInterval((watermeterService.getTemperatureInterval()));
    		
    		meterData.setIntervalFlow(watermeterService.getIntervalFlow().stream().map(String::valueOf).collect(Collectors.joining(",")));
    		

    		
					    String json=null;
						try {
							json = mapper.writeValueAsString(meterData);
							logger.info("dispatching telemetry" +json);
						} catch (JsonProcessingException e) {
							// TODO Auto-generated catch block
							logger.error(e.getMessage());
						}    		
					    		
           
					    		
   		
    		client.preparePost("https://aquatech-core.azurewebsites.net/api/Telemetry/SaveMeterReading").
    		setHeader("Content-Type","application/json").
            setBody(json)
    		.execute(new AsyncHandler<Integer>() {
    			private Integer status;
    			@Override
    			public State onStatusReceived(HttpResponseStatus responseStatus) throws Exception {
    				status = responseStatus.getStatusCode();
    				return State.ABORT;
    			}
    			@Override
    			public State onHeadersReceived(HttpHeaders headers) throws Exception {
    				return State.ABORT;
    			}
    			@Override
    			public State onBodyPartReceived(HttpResponseBodyPart bodyPart) throws Exception {
    				
    				
    				
    				return State.ABORT;
    			}
    			@Override
    			public Integer onCompleted( ) throws Exception {
    				
    				logger.info("collector api endpoint result ............"+status);
    				return status;
    			}
    			@Override
    			public void onThrowable(Throwable t) {
    				
    				logger.error(t.getMessage());
    			}
    		});
    		
    		
    		try {
    			
    			  

    			
    			  SendBillingInfo.notifySulis(watermeterService.getTimeOfReading(), "5",String.valueOf(watermeterService.getDailyFlow()), reading.getIdentifier());
    			
    		}catch (Exception e) {
				logger.error(e.getMessage());
			}
            
            
        };
		
		
        		executorService.submit(runnable);
        		
        		executorService.shutdown();

		
	}


}
