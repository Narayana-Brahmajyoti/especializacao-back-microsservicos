package com.checkpoint.movie.service.impl;

import com.checkpoint.movie.entity.dto.MovieDTOIN;
import com.checkpoint.movie.entity.dto.MovieDTOOUT;
import com.checkpoint.movie.entity.MovieEntity;
import com.checkpoint.movie.repository.MovieRepository;
import com.checkpoint.movie.service.MovieService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

    @Value("${queue.movie-service}")
    private String queueMovie;

    @Autowired
    private MovieRepository repository;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Override
    public List<MovieDTOOUT> findByGenre(String genre) {
        return repository.findByGenre(genre).stream().map(MovieDTOOUT::new).collect(Collectors.toList());
    }

    @Override
    public void createMovie(MovieDTOIN movieDTOIN) {
        MovieEntity movie = new MovieEntity(movieDTOIN);

        MovieDTOOUT movieDTOOUT =
                new MovieDTOOUT(repository.save(movie));

        rabbitTemplate.convertAndSend(this.queueMovie, movieDTOOUT);


//       MovieEntity movie = new MovieEntity();
//       movie.setName(dto.getName());
//       movie.setGenre(dto.getGenre());
//       movie.setUrlStream(dto.getUrlStream());
//       repository.save(movie);
//       rabbitTemplate.convertAndSend(this.queueMovie, dto);

    }
}
