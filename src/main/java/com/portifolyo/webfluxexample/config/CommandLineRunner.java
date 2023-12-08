package com.portifolyo.webfluxexample.config;

import com.portifolyo.webfluxexample.entity.CategoryEntity;
import com.portifolyo.webfluxexample.repository.CategoryRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public CommandLineRunner(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        CategoryEntity entity = new CategoryEntity(null, "Action");
        categoryRepository.save(entity);
    }
}
