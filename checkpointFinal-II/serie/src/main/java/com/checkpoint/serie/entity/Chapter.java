package com.checkpoint.serie.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer numeroEpisodio;
    @ManyToOne(fetch = FetchType.LAZY)
    private Seasons seasons;
    

}
