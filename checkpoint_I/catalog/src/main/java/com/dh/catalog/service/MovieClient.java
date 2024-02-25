package com.dh.catalog.service;

import com.dh.catalog.entity.CatalogEntity;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("movie-service")
@LoadBalancerClient("movie-service")
public interface MovieClient {

    @GetMapping("movies")
    List<CatalogEntity> findAll();

    @GetMapping("/movies/{genre}")
    List<CatalogEntity> findByGenre(@PathVariable String genre);


}
