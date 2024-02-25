package com.dh.catalog.controller;

import com.dh.catalog.entity.CatalogEntity;
import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService service;


    @GetMapping()
    public ResponseEntity<List<CatalogEntity>> getAllMovie(){
        return ResponseEntity.ok(service.getAllMovie());
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<CatalogEntity>> getMovieByGenre(@PathVariable String genre){
        return ResponseEntity.ok(service.getMovieByGenre(genre));
    }


}
