package com.ts.kafkademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class KafkaService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }

    public void sendMessgae(String topic,String message,String key,Integer partion){
        kafkaTemplate.send(topic,partion,key,message);
    }


    @Scheduled(cron = "* * * * * ?")
    public void sendMsg(){
//        System.out.println("sendMsg running ...");
        sendMessage("my-topic","msg...");
    }
}
