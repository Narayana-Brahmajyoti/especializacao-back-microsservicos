package com.dh.movie.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "Movie")
@Entity
public class MovieEntity {

    @Id
    @GeneratedValue()
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false, unique = true)
    private String urlStream;

}
