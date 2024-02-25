package com.dh.catalog.service.impl;

import com.dh.catalog.entity.CatalogEntity;
import com.dh.catalog.service.CatalogService;
import com.dh.catalog.service.MovieClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieClient service;


    @Override
    public List<CatalogEntity> getMovieByGenre(String genre) {
        List<CatalogEntity> movie;
        return movie = service.findByGenre(genre);
    }

    @Override
    public List<CatalogEntity> getAllMovie() {
        List<CatalogEntity> genre;
        return genre = service.findAll();
    }
}
