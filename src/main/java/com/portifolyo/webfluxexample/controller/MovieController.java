package com.portifolyo.webfluxexample.controller;

import com.portifolyo.webfluxexample.model.MovieDto;
import com.portifolyo.webfluxexample.service.MovieService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;


    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public Mono<MovieDto> save(@RequestBody MovieDto dto) {
        return movieService.save(dto);
    }

    @GetMapping
    public Flux<MovieDto> findAll(){
        return this.movieService.findAll();
    }
}
