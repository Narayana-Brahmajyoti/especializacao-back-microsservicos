package com.checkpoint.catalog.queue;

import com.checkpoint.catalog.entity.dto.MovieDTO;
import com.checkpoint.catalog.entity.dto.SerieDTO;
import com.checkpoint.catalog.service.MovieService;
import com.checkpoint.catalog.service.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class SerieListener {

    @Autowired
    private final SerieService service;

    @RabbitListener(queues = {"${queue.serie-service}"})
    public void listen(SerieDTO dto) {
        service.saveSerie(dto);
    }
}
