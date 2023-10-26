package com.ts.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topicPartitions = {
            @TopicPartition(topic = "my-topic", partitions = { "0" }),
    }, groupId = "my-group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
