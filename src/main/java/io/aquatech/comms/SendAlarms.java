package io.aquatech.comms;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.HttpResponseBodyPart;
import org.asynchttpclient.HttpResponseStatus;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.aquatech.collector.DateHelper;
import io.aquatech.dto.alarms.Alarm;
import io.aquatech.dto.alarms.AlarmTelemetry;
import io.aquatech.dto.alarms.Datum;
import io.netty.handler.codec.http.HttpHeaders;
import org.slf4j.Logger;

public class SendAlarms {

    private static final Logger logger  = LoggerFactory.getLogger(SendAlarms.class);


	public static void sendData(String jsonContent) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		DateHelper datehelper = new DateHelper();

		logger.info("Creating a Runnable...");
		Runnable runnable = () -> {
			System.out.println("Inside : " + Thread.currentThread().getName());
			AsyncHttpClient client = Dsl.asyncHttpClient();
			ObjectMapper mapper = new ObjectMapper();
			Alarm alarm = new Alarm();
			AlarmTelemetry alarmTelemetry = new AlarmTelemetry();

			try {

				alarm = mapper.readValue(jsonContent, Alarm.class);

			} catch (IOException e) {

				logger.error(e.getMessage());
			}

			List<Datum> services = alarm.getData();

			for (Datum datum : services) {

				try {

					alarmTelemetry.setAlarmStatus(true);
					alarmTelemetry.setAlarmType(datum.getServiceData().getAlarmName());
					alarmTelemetry.setMeterCode(alarm.getIdentifier());
					alarmTelemetry.setTimeStamp(
					datehelper.processDate(datum.getServiceData().getTimestamp(), "yyyyMMdd'T'HHmmss'Z'"));
					logger.info("dispatching alarm telemetry" + datum.getServiceData().getTimestamp());
					
					String json = null;
					try {
						json = mapper.writeValueAsString(alarmTelemetry);
						logger.info("dispatching alarm telemetry" + json);
					} catch (JsonProcessingException e) {
						// TODO Auto-generated catch block
						logger.error(e.getMessage());
					}
					
					client.preparePost("https://chuidemo.azurewebsites.net/api/Telemetry/SaveAlarmReading")
					.setHeader("Content-Type", "application/json").setBody(json).execute(new AsyncHandler<Integer>() {
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
						public Integer onCompleted() throws Exception {

							logger.info("collector api endpoint result =>" + status);
							return status;
						}

						@Override
						public void onThrowable(Throwable t) {

							logger.error(t.getMessage());
						}
					});
				
				
				
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			

		

		};

		executorService.submit(runnable);

		executorService.shutdown();

	}

}
