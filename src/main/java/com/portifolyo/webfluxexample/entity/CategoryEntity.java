package com.portifolyo.webfluxexample.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;
@Table(name = "category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false, of = "id")
public class CategoryEntity implements Persistable<UUID> {

    @Id
    private UUID id;
    @Column("category_name")
    private String name;


    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }

    public CategoryEntity(UUID id){
        this.id = id;
    }
}
