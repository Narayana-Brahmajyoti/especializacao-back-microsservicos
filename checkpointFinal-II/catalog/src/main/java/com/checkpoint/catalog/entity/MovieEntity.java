package com.checkpoint.catalog.entity;

import com.checkpoint.catalog.entity.dto.MovieDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String urlStream;

    public MovieEntity(MovieDTO movieDTOOUT){
        this.id = movieDTOOUT.getId();
        this.name =  movieDTOOUT.getName();
        this.genre =  movieDTOOUT.getGenre();
        this.urlStream =  movieDTOOUT.getUrlStream();
    }
}
