package com.checkpoint.catalog.entity.dto;

import com.checkpoint.catalog.entity.dto.SeasonDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SerieDTO {
    private Long id;
    private String name;
    private String genre;
    private List<SeasonDTO> seasonDTOSet;

}