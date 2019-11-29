package com.example.source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;
import java.util.UUID;

@Component
class CoffeeGenerator {
    @Value("${names:CafeCereza,Kaldi,Sumatra,CasiCielo,Kona}")
    private String[] names;

    private final Random rnd = new Random();

    @PostConstruct
    private void showConfig() {
        System.out.println("List of Available Coffees: " + String.join(",", names));
    }

    WholesaleCoffee generate() {
        return new WholesaleCoffee(UUID.randomUUID().toString(),
                names[rnd.nextInt(names.length)]);
    }
}
