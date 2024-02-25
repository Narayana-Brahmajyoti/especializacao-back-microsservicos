package com.checkpoint.serie.service.impl;

import com.checkpoint.serie.entity.Chapter;
import com.checkpoint.serie.entity.Seasons;
import com.checkpoint.serie.entity.Serie;
import com.checkpoint.serie.repository.SerieRepository;
import com.checkpoint.serie.service.SerieService;
import com.checkpoint.serie.service.dto.ChapterDTO;
import com.checkpoint.serie.service.dto.SeasonDTO;
import com.checkpoint.serie.service.dto.SerieDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SerieServiceImpl implements SerieService {

    @Value("${queue.serie-service}")
    private String queueSerie;

    @Autowired
    private SerieRepository repository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public List<SerieDTO> findByGenre(String genre) {
        return repository.findByGenreIgnoreCase(genre).stream().map(SerieDTO::new).collect(Collectors.toList());
    }

    @Override
    public void save(SerieDTO dto) {
        Serie serie = new Serie();
        serie.setName(dto.getName());
        serie.setGenre(dto.getGenre());
        serie.setSeansonsSet(generateSeason(dto.getSeasonDTOSet(), serie));
        repository.save(serie);
        rabbitTemplate.convertAndSend(this.queueSerie, dto);
    }

    private List<Seasons> generateSeason(List<SeasonDTO> seasonDTOSet, Serie serie) {
        List<Seasons> seasonsList = new ArrayList<>();
        for (SeasonDTO seasonDTO : seasonDTOSet) {
           Seasons seasons = new Seasons();
           seasons.setSerie(serie);
           seasons.setNumeroTemporada(seasonDTO.getNumeroTemporada());
           seasons.setChapterSet(generateChapter(seasonDTO.getChapterDTOSet(), seasons));
           seasonsList.add(seasons);
        }
        return seasonsList;
    }

    private List<Chapter> generateChapter(List<ChapterDTO> chapterDTOSet, Seasons seasons) {
        List<Chapter> chapterList = new ArrayList<>();
        for (ChapterDTO chapterDTO : chapterDTOSet) {
            Chapter chapter = new Chapter();
            chapter.setName(chapterDTO.getName());
            chapter.setNumeroEpisodio(chapterDTO.getNumeroEpisodio());
            chapter.setSeasons(seasons);
            chapterList.add(chapter);
        }
        return chapterList;
    }
}
