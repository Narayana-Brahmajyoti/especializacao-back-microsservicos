package com.checkpoint.catalog.service;

import com.checkpoint.catalog.entity.dto.SerieDTO;

import java.util.List;

public interface SerieService {

    void saveSerie(SerieDTO serieDTO);

    void createSerie(SerieDTO serieDTO);

    List<SerieDTO> findSerieByGenre(String genre);

}
