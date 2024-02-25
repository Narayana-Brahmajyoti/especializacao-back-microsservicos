package com.checkpoint.movie.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQSenderConfig {

    @Value("${queue.movie-service}")
    private String queueMovie;

    @Bean
    public Queue MailQueue() {
        return new Queue(this.queueMovie,false);
    }

}
