package com.example.sink;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
class CoffeeDrinker {

    @Bean
    Consumer<RetailCoffee> drinkIt() {
        return r -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + r.getName());
        };
    }
}
