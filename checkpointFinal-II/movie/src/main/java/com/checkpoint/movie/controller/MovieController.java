package com.checkpoint.movie.controller;

import com.checkpoint.movie.entity.dto.MovieDTOIN;
import com.checkpoint.movie.entity.dto.MovieDTOOUT;
import com.checkpoint.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTOOUT>> findByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(movieService.findByGenre(genre));
    }

    @PostMapping
    public ResponseEntity<Void> createMovie(@RequestBody MovieDTOIN movieDTOIN) {
        movieService.createMovie(movieDTOIN);
        return ResponseEntity.noContent().build();
    }
}
