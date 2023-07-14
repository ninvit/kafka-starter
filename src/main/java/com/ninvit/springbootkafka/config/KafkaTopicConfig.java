package com.ninvit.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic ninvitTopic(){
        return TopicBuilder.name("ninvit").build();
    }

    @Bean
    public NewTopic ninvitJsonTopic(){
        return TopicBuilder.name("ninvit_json").build();
    }
}
