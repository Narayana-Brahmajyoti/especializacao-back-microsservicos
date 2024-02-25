package com.checkpoint.catalog.service.impl;

import com.checkpoint.catalog.client.MovieClient;
import com.checkpoint.catalog.entity.MovieEntity;
import com.checkpoint.catalog.entity.dto.MovieDTO;
import com.checkpoint.catalog.repository.MovieRepository;
import com.checkpoint.catalog.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {


    private final MovieRepository repository;
    private final MovieClient client;

    @Override

    public void createMovie(MovieDTO movieDTO) {
        client.createMovie(movieDTO);
    }

    @Override
    public void saveMovie(MovieDTO movieDTO) {
        MovieEntity movie = new MovieEntity(movieDTO);
        repository.save(movie);
    }

    @Override
    public List<MovieDTO> getMovieByGenre(String genre) {
        return client.findMovieByGenre(genre);
    }

}
