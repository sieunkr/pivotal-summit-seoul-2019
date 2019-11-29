package com.example.demo;

import lombok.Data;

@Data
class WholesaleCoffee {
    private String id;
    private String name;

    WholesaleCoffee(){
    }

    WholesaleCoffee(String id, String name){
        this.id = id;
        this.name = name;
    }

}
