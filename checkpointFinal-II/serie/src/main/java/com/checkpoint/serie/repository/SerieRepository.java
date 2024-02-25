package com.checkpoint.serie.repository;

import com.checkpoint.serie.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
    List<Serie> findByGenreIgnoreCase(String genre);
}
