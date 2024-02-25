package com.checkpoint.movie.entity;

import com.checkpoint.movie.entity.dto.MovieDTOIN;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String genre;

    private String urlStream;

    public MovieEntity(MovieDTOIN movieDTOIN) {
        this.name = movieDTOIN.getName();
        this.genre = movieDTOIN.getGenre();
        this.urlStream = movieDTOIN.getUrlStream();
    }
}
