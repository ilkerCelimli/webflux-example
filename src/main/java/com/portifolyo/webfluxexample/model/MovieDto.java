package com.portifolyo.webfluxexample.model;

public record MovieDto(
        String id,
        String movieName,
        int releaseYear,
        String categoryId
) {
}
