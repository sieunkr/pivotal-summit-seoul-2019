package com.example.source;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.function.Supplier;

@Configuration
@EnableScheduling
@AllArgsConstructor
class CoffeeGrower {
    private final CoffeeGenerator generator;

    @Scheduled(fixedRate = 1000)
    @Bean
    Supplier<WholesaleCoffee> sendCoffee() {
        return generator::generate;
    }
}