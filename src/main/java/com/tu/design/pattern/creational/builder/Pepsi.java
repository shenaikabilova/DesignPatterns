package com.tu.design.pattern.creational.builder;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Pepsi extends ColdDrink {

    public Pepsi() {
        super("Pepsi");
    }

    @Override
    public long getPrice() {
        return 12;
    }
}
