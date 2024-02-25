package com.checkpoint.catalog.controller;

import com.checkpoint.catalog.entity.dto.MovieDTO;
import com.checkpoint.catalog.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService service;

    @PostMapping()
    public ResponseEntity<Void> createMovie(@RequestBody MovieDTO movieDTO) {
        service.createMovie(movieDTO);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTO>> findByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(service.getMovieByGenre(genre));
    }

}

