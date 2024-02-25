package com.checkpoint.serie.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQSenderConfig {

    @Value("${queue.serie-service}")
    private String queueSerie;

    @Bean
    public Queue MailQueue() {
        return new Queue(this.queueSerie,false);
    }

}
