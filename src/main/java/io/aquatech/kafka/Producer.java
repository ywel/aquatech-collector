package io.aquatech.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Producer {
	
    private static final Logger log = LoggerFactory.getLogger(Producer.class);
    
    
    
    public static void main(String args[]) {
    	
    	//writeToTopic();
    	
    }
    
    

	public void writeToTopic(String topic,String key,String message) {
		
		 String bootstrapServers = "127.0.0.1:9092";

		
        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
        
       
        
        
        
        producer.send(
                new ProducerRecord<>(topic, key, message),
                (event, ex) -> {
                    if (ex != null)
                        log.error(ex.getMessage());
                    else
                        System.out.printf("Produced event to topic %s: key = %-10s value = %s%n", topic, key, message);
                });
    


        producer.close();



		
	}

}
