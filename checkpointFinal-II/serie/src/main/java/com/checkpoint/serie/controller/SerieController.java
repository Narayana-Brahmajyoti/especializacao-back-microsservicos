package com.checkpoint.serie.controller;

import com.checkpoint.serie.service.SerieService;
import com.checkpoint.serie.service.dto.SerieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @Autowired
    private SerieService serieService;

    @GetMapping("/{genre}")
    public ResponseEntity<List<SerieDTO>> findByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(serieService.findByGenre(genre));
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody SerieDTO dto) {
        serieService.save(dto);
        return ResponseEntity.noContent().build();
    }
}
