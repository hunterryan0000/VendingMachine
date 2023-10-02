package com.techelevator.model;

import java.math.BigDecimal;

public class Gum extends Item{
    public Gum(String name, BigDecimal price, String type) {
        super(name, price, type);
    }


    public Gum() {

    }

    @Override
    public String getSound(){
        return "Chew Chew, Yum!";
    }
}
