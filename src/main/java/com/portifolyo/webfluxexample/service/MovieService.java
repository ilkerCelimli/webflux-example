package com.portifolyo.webfluxexample.service;

import com.portifolyo.webfluxexample.entity.MovieEntity;
import com.portifolyo.webfluxexample.model.MovieDto;
import com.portifolyo.webfluxexample.repository.MovieRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public Mono<MovieDto> save(MovieDto dto) {
        return this.movieRepository.save(MovieEntity.from(dto)).map(movieEntity -> new MovieDto(movieEntity.getId().toString(),movieEntity.getMovieName(),movieEntity.getReleaseYear(),movieEntity.getCategoryId()));
    }

    public Flux<MovieDto> findAll(){
        return this.movieRepository.findAll().map(movieEntity -> new MovieDto(movieEntity.getId().toString(),movieEntity.getMovieName(),movieEntity.getReleaseYear(),movieEntity.getCategoryId()));
    }
}
