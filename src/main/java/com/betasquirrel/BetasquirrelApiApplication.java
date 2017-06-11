package com.betasquirrel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.betasquirrel")
@SpringBootApplication
public class BetasquirrelApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetasquirrelApiApplication.class, args);
    }
}
