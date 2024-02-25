package com.checkpoint.serie.service;

import com.checkpoint.serie.service.dto.SerieDTO;

import java.util.List;

public interface SerieService {
    List<SerieDTO> findByGenre(String genre);

    void save(SerieDTO dto);
}
