package com.checkpoint.movie.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDTOIN implements Serializable {

    private String name;
    private String genre;
    private String urlStream;

}
