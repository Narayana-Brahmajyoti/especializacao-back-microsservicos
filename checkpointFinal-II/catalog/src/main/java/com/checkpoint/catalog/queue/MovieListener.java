package com.checkpoint.catalog.queue;

import com.checkpoint.catalog.entity.dto.MovieDTO;
import com.checkpoint.catalog.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MovieListener {

    private final MovieService service;

    @RabbitListener(queues = {"${queue.movie-service}"})
    public void listen(MovieDTO dto) {
        service.saveMovie(dto);
    }
}

