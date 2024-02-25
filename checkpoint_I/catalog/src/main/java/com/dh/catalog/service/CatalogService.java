package com.dh.catalog.service;

import com.dh.catalog.entity.CatalogEntity;

import java.util.List;

public interface CatalogService {

    List<CatalogEntity> getMovieByGenre(String genre);

    List<CatalogEntity> getAllMovie();
}
