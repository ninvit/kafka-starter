package com.ninvit.springbootkafka.kafka;

import com.ninvit.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "ninvit_json", groupId = "myGroup")
    public void consume(User data){
        LOGGER.info(String.format("Json message received from topic -> %s", data.toString()));
    }
}
