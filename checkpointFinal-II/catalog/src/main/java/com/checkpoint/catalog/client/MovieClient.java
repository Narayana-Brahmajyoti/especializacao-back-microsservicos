package com.checkpoint.catalog.client;


import com.checkpoint.catalog.entity.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "movie-service")
public interface MovieClient {

    @PostMapping("/movie-api/movies")
    void createMovie(@RequestBody MovieDTO movieDTO);

    @GetMapping("/movie-api/movies/{genre}")
    List<MovieDTO> findMovieByGenre(@PathVariable String genre);
}
