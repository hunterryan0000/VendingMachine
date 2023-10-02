package com.techelevator.model;

import java.math.BigDecimal;

public abstract class Item {
    private String name;
    private BigDecimal price;
    private String type;
    private int quantity;

    public Item(String name, BigDecimal price, String type, int quantity) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    public Item(String name, BigDecimal price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
        setQuantity(5);
    }

    public Item() {

    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public abstract String getSound();
}
