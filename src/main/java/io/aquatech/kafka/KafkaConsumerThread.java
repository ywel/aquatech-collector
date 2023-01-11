package io.aquatech.kafka;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.aquatech.comms.UdpClient;
import io.aquatech.dto.Datum;
import io.aquatech.dto.HuizongReading;
import io.aquatech.dto.ServiceData;

import java.util.Properties;
import java.util.Arrays;
import java.util.List;
import java.time.Duration;

public class KafkaConsumerThread extends Thread {

    private final KafkaConsumer<String, String> consumer;
    private final String topic1;
    private final String topic2;
    
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerThread.class);


    public KafkaConsumerThread(String topic1, String topic2) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "udp-consumer-group");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        this.consumer = new KafkaConsumer<>(props);
        this.topic1 = topic1;
        this.topic2 = topic2;
    }

    @Override
    public void run() {
        // Subscribe to the topics
        consumer.subscribe(Arrays.asList("readings"));

        ObjectMapper mapper=new ObjectMapper();
        HuizongReading reading =new HuizongReading();
        

        // Poll for new messages
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record : records) {
            //	logger.info("Received message: (" + record.key() + ", " + record.value() + ") at offset " + record.offset() + " from partition " + record.partition());
            
                 try {
                          
                 		//reading=mapper.readValue(record.value(),HuizongReading.class);
                 		
                 		  //List<Datum> services = reading.getData();

                  		//ServiceData meterService = services.get(0).getServiceData();
                  		
                  		
                  	//	logger.info(meterService.getOriginalData());
                  		
                  		
                  		UdpClient udpClient = new UdpClient();

    					udpClient.sendData( record.value());
                 	
     			} catch (Exception e) {
     				
     				
     				
     				logger.error(e.getMessage());
     			}
            	
            	
                
            
            
            }
        }
    }
}
