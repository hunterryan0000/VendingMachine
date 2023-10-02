package com.techelevator.model;

import java.math.BigDecimal;

public class Drink extends Item{
    public Drink(String name, BigDecimal price, String type) {
        super(name, price, type);
    }

    public Drink() {

    }


    @Override
    public String getSound(){
        return "Glug Glug, Yum!";
    }
}
