package com.checkpoint.catalog.service;

import com.checkpoint.catalog.entity.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    void createMovie(MovieDTO movieDTO);

    void saveMovie(MovieDTO movieDTO);

    List<MovieDTO> getMovieByGenre(String genre);

}
