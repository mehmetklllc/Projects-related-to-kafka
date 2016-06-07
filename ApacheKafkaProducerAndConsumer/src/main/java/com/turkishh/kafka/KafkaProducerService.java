package com.turkishh.kafka;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;

@Service
@PropertySource("classpath:/service.properties")
public class KafkaProducerService {
	
	private Log log = LogFactory.getLog(getClass());
	@Value("${kafka.producer.topic}")
    String kafkaTopic;
	

	@Autowired
	Producer<String,String> producer;
	

	
	/**
	* Kafka writes value
	*
	* @param   data  - The type parameter String 
	* @return  the method return type is void
	* @author  mkilic 
	*/
	public void setMessage(String data){
		KeyedMessage<String, String> message =new KeyedMessage<String, String>(kafkaTopic,data);
		log.info(" producer data :  " + data);
        producer.send(message);
	}
	
}