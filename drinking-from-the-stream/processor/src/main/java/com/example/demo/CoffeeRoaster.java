package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Random;
import java.util.function.Function;

@Configuration
class CoffeeRoaster {
    private final Random rnd = new Random();

    @Bean
    Function<WholesaleCoffee, RetailCoffee> processIt() {
        return wCoffee -> {
            RetailCoffee rCoffee = new RetailCoffee(wCoffee.getId(),
                    wCoffee.getName(),
                    rnd.nextInt(2) == 0
                            ? RetailCoffee.State.WHOLE_BEAN
                            : RetailCoffee.State.GROUND);

            System.out.println(rCoffee);
            return rCoffee;
        };
    }

    @Bean
    Function<RetailCoffee, RetailCoffee> fixIt() {
        return coffee -> new RetailCoffee(coffee.getId(),
                coffee.getName(),
                RetailCoffee.State.WHOLE_BEAN);
    }
}
