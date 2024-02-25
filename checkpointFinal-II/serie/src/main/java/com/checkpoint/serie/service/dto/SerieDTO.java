package com.checkpoint.serie.service.dto;

import com.checkpoint.serie.entity.Serie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerieDTO {
    private Long id;
    private String name;
    private String genre;
    private List<SeasonDTO> seasonDTOSet;

    public SerieDTO(Serie serie) {
        this.id = serie.getId();
        this.name = serie.getName();
        this.genre = serie.getGenre();
    }
}
