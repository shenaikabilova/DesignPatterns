package com.tu.design.pattern.creational.builder;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Coke extends ColdDrink {

    public Coke() {
        super("Coke");
    }

    @Override
    public long getPrice() {
        return 12;
    }
}
