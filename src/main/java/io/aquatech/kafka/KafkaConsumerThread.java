package io.aquatech.kafka;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huawei.m2m.cig.tup.modules.protocol_adapter.IProtocolAdapter;
import com.huizhong.codec.huizhong.ProtocolAdapterImpl;
import com.huizhong.codec.util.DataTypeUtil;

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
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerThread.class);


    public KafkaConsumerThread(String topic1, String topic2) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "hz_consumer");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        this.consumer = new KafkaConsumer<>(props);
    }

    @Override
    public void run() {
        // Subscribe to the topics
        consumer.subscribe(Arrays.asList("hz_telemetry"));

		/*
		 * ObjectMapper mapper=new ObjectMapper(); new HuizongReading(); Producer
		 * kafkaProducer = new Producer();
		 */
  		UdpClient udpClient = new UdpClient();

        // Poll for new messages
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record : records) {
            logger.info("Received message: (" + record.key() + ", " + record.value() + ") at offset " + record.offset() + " from partition " + record.partition());
            
                 try {
     				

					/*IProtocolAdapter adapter = new ProtocolAdapterImpl();
					 * ObjectNode result =
					 * adapter.decode(DataTypeUtil.parseHexStr2ByteArr(record.value()));
					 * 
					 * String jsonString = result.toString(); if (jsonString.contains("swVersion"))
					 * { kafkaProducer.writeToTopic("readings", "readings", jsonString); }else {
					 * 
					 * }
					 */
                  	//	logger.info(meterService.getOriginalData());
                  		
                  		

    					//udpClient.sendData( record.value());
                 	
     			} catch (Exception e) {
     				
     				
     				
     				logger.error(e.getMessage());
     			}
            	
            	
                
            
            
            }
        }
    }
}
