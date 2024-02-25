package com.checkpoint.movie.entity.dto;

import com.checkpoint.movie.entity.MovieEntity;
import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTOOUT implements Serializable {
    private Long id;
    private String name;
    private String genre;
    private String urlStream;

    public MovieDTOOUT(MovieEntity movieEntity) {
        this.id = movieEntity.getId();
        this.name = movieEntity.getName();
        this.genre = movieEntity.getGenre();
        this.urlStream = movieEntity.getUrlStream();
    }


}
