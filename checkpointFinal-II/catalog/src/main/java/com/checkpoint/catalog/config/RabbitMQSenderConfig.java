package com.checkpoint.catalog.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQSenderConfig {

    @Value("${queue.movie-service}")
    private String queueMovie;

    @Value("${queue.serie-service}")
    private String queueSerie;

    @Bean
    public Queue serieQueue() {
        return new Queue(this.queueSerie,false);
    }

    @Bean
    public Queue movieQueue() {
        return new Queue(this.queueMovie,false);
    }

}
