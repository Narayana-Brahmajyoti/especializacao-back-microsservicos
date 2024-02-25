package com.checkpoint.movie.service;

import com.checkpoint.movie.entity.dto.MovieDTOIN;
import com.checkpoint.movie.entity.dto.MovieDTOOUT;

import java.util.List;

public interface MovieService {

    List<MovieDTOOUT> findByGenre(String genre);

    void createMovie(MovieDTOIN movie);

}
