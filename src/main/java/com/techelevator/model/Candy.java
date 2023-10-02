package com.techelevator.model;

import java.math.BigDecimal;

public class Candy extends Item{


    public Candy(String name, BigDecimal price, String type) {
        super(name, price, type);
    }


    public Candy() {
    }

    @Override
    public String getSound(){
        return "Munch Munch, Yum!";
    }
}
