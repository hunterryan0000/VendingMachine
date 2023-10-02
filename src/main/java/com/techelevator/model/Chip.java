package com.techelevator.model;

import java.math.BigDecimal;

public class Chip extends Item{
    public Chip(String name, BigDecimal price, String type) {
        super(name, price, type);
    }

    public Chip() {

    }

    @Override
    public String getSound(){
        return "Crunch Crunch, Yum!";
    }
}
