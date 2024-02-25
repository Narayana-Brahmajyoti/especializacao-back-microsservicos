package com.checkpoint.catalog.entity.dto;

import com.checkpoint.catalog.entity.dto.ChapterDTO;
import lombok.Data;

import java.util.List;

@Data
public class SeasonDTO {
    private Long id;
    private Integer numeroTemporada;
    private List<ChapterDTO> chapterDTOSet;
}
