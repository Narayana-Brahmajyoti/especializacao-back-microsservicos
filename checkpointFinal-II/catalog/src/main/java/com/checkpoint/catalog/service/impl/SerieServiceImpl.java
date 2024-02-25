package com.checkpoint.catalog.service.impl;

import com.checkpoint.catalog.client.SerieClient;
import com.checkpoint.catalog.entity.SerieEntity;
import com.checkpoint.catalog.entity.dto.SerieDTO;
import com.checkpoint.catalog.repository.SerieRepository;
import com.checkpoint.catalog.service.SerieService;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SerieServiceImpl implements SerieService {

    private final SerieRepository repository;
    private final SerieClient client;
    @Override
    public void saveSerie(SerieDTO serieDTO) {
        SerieEntity serie = new SerieEntity(serieDTO);
        repository.save(serie);

    }

    @Override
    public void createSerie(SerieDTO serieDTO) {
        client.createSerie(serieDTO);
    }

    @Override
    @CircuitBreaker(name = "serie-service", fallbackMethod = "fallback")
    public List<SerieDTO> findSerieByGenre(String genre) {
        return client.findSerieByGenre(genre);
    }

    public List<SerieDTO> fallback(String genre, CallNotPermittedException ex) {
        try {
            throw new RuntimeException("logstash- " + ex.getCausingCircuitBreakerName());
        } catch (RuntimeException e) {
            System.out.println("Test log");
        }
        var dto = SerieDTO.builder().name("Serviço indisponível").genre(ex.getCausingCircuitBreakerName()).build();
        return List.of(dto);
    }
}
