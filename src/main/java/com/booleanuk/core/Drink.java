package com.booleanuk.core;

import java.util.List;

public class Drink implements Product {
    String name;
    int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
