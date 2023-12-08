package com.portifolyo.webfluxexample.repository;

import com.portifolyo.webfluxexample.entity.CategoryEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.UUID;

public interface CategoryRepository extends R2dbcRepository<CategoryEntity, UUID> {
}
