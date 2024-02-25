package com.checkpoint.catalog.entity.dto;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {

    private Long id;

    private String name;

    private String genre;

    private String urlStream;
}
