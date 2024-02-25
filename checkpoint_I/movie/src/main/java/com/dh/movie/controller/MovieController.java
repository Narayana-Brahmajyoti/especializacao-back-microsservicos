package com.dh.movie.controller;

import com.dh.catalog.controller.CatalogController;
import com.dh.movie.entity.MovieEntity;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private static Logger log = Logger.getLogger(CatalogController.class.getName());
    @Autowired
    private MovieService service;

    @PostMapping("/create")
    public ResponseEntity<MovieEntity> create(@RequestBody MovieEntity movieEntity){
        log.info("create");
        return new ResponseEntity<>(service.create(movieEntity), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<MovieEntity>> getAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);

    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieEntity>> getByGenre(@PathVariable String genre){
        return new ResponseEntity<>(service.findByGenre(genre), HttpStatus.OK);
    }
}
