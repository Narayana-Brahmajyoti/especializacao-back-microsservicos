package com.checkpoint.serie.service.dto;

import lombok.Data;

import java.util.List;

@Data
public class SeasonDTO {
    private Long id;
    private Integer numeroTemporada;
    private List<ChapterDTO> chapterDTOSet;
}
