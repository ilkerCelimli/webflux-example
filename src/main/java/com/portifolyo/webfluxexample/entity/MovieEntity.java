package com.portifolyo.webfluxexample.entity;

import com.portifolyo.webfluxexample.model.MovieDto;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table("movie")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false, of = "id")
public class MovieEntity implements Persistable<UUID> {

    @Id
    private UUID id;

    @Column("movie_name")
    private String movieName;

    @Column("release_year")
    private int releaseYear;

    @Column("category_id")
    private String categoryId;

    @Column("created_time")
    private Date createdTime;



    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return true;
    }

    public static MovieEntity from(MovieDto dto) {
        return new MovieEntity(UUID.fromString(dto.id()), dto.movieName(), dto.releaseYear(), dto.categoryId(),null);
    }
}
