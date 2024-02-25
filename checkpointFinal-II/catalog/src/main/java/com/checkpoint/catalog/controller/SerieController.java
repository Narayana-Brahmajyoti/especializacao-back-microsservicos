package com.checkpoint.catalog.controller;

import com.checkpoint.catalog.entity.dto.SerieDTO;
import com.checkpoint.catalog.service.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/serie")
public class SerieController {

    private final SerieService service;

    @PostMapping
    public ResponseEntity<Void> createSerie(@RequestBody SerieDTO serieDTO) {
        service.createSerie(serieDTO);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<SerieDTO>> findSerieByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(service.findSerieByGenre(genre));
    }
}
