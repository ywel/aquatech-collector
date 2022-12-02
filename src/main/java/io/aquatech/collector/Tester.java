package io.aquatech.collector;

import java.io.IOException;

import org.asynchttpclient.AsyncHandler;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.HttpResponseBodyPart;
import org.asynchttpclient.HttpResponseStatus;
import org.asynchttpclient.AsyncHandler.State;

import com.fasterxml.jackson.databind.ObjectMapper;
	 import com.fasterxml.jackson.databind.node.ObjectNode;
	import com.huawei.m2m.cig.tup.modules.protocol_adapter.IProtocolAdapter;
 import com.huizhong.codec.huizhong.ProtocolAdapterImpl;
 import com.huizhong.codec.util.*;

import io.netty.handler.codec.http.HttpHeaders;

public class Tester  {
	
	  public static void main(String[] args){
		  
		  
		
	  String mtr="4123366841";	
	  
	  System.out.println(mtr.substring(2));
		
	  }
	  
	  public static void sendData(String jsonContent) {
			
			AsyncHttpClient client = Dsl.asyncHttpClient();
			
			client.preparePost(" http://localhost:7071/api/huizongreading").
			setHeader("Content-Type","application/json").
	        setBody(jsonContent)
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
				public Integer onCompleted() throws Exception {
					
					System.out.println("++++++++++++++++++++++"+status);
					return status;
				}
				@Override
				public void onThrowable(Throwable t) {
					System.out.println(t.getMessage());
				}
			});

			
		}

}
