package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class RetailCoffee {
    enum State {
        WHOLE_BEAN,
        GROUND
    }

    private String id, name;
    private State state;
}
