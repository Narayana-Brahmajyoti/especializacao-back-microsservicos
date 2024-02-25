package com.checkpoint.serie.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seasons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroTemporada;
    @ManyToOne(fetch = FetchType.LAZY)
    private Serie serie;
    @OneToMany(mappedBy = "seasons", cascade = CascadeType.ALL)
    private List<Chapter> chapterSet;
    

}
