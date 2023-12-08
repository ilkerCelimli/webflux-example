package com.portifolyo.webfluxexample.config;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    public ConnectionFactory connectionFactory(){
        PostgresqlConnectionConfiguration configuration = PostgresqlConnectionConfiguration.builder()
                .database("webflux-example")
                .username("admin")
                .password("12345")
                .port(10000)
                .host("localhost")
                .build();
        return new PostgresqlConnectionFactory(configuration);
    }

}
