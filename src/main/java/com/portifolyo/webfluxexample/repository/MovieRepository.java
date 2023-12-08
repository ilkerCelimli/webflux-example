package com.portifolyo.webfluxexample.repository;

import com.portifolyo.webfluxexample.entity.MovieEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface MovieRepository extends R2dbcRepository<MovieEntity, UUID> {
}
