package com.checkpoint.movie.repository;

import com.checkpoint.movie.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {

    List<MovieEntity> findByGenreIgnoreCase(String genre);
    List<MovieEntity> findByGenre(String genre);

}
