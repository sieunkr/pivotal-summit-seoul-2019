package com.example.sink;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class RetailCoffee {
    enum CoffeeState {
        WHOLE_BEAN,
        GROUND
    }

    RetailCoffee(){
    }

    private String id, name;
    private CoffeeState state;
}
