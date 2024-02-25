package com.dh.movie.service;

import com.dh.movie.entity.MovieEntity;
import com.dh.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository repository;

    public MovieEntity create(MovieEntity movieEntity){
        return repository.save(movieEntity);
    }

    public List<MovieEntity> findAll(){
        return repository.findAll();
    }

    public List<MovieEntity> findByGenre(String genre){
        return repository.findByGenreIgnoreCase(genre);
    }
}
