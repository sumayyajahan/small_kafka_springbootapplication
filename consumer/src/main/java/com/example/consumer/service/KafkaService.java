package com.example.consumer.service;

import com.example.consumer.model.Course;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private String message;

    @KafkaListener(topics = "sumayya", groupId = "sumayya-group")
    public void consume(Course course){

        message = course + "Got the data from kafka";
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }
}
