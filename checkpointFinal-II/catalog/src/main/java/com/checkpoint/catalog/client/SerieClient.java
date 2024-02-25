package com.checkpoint.catalog.client;

import com.checkpoint.catalog.entity.dto.SerieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("serie-service")
public interface SerieClient {

    @PostMapping("/serie-api/serie")
    void createSerie(@RequestBody SerieDTO serieDTO);

    @GetMapping("/serie-api/serie/{genre}")
    List<SerieDTO> findSerieByGenre(@PathVariable String genre);
}
