package com.checkpoint.catalog.entity;

import com.checkpoint.catalog.entity.dto.SerieDTO;
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
public class SerieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;

    public SerieEntity(SerieDTO serieDTO) {
        this.id = serieDTO.getId();
        this.name = serieDTO.getName();
        this.genre = serieDTO.getGenre();
    }
}
