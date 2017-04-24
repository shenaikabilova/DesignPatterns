package com.tu.design.pattern.creational.builder;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class ChickenBurger extends Burger {

    public ChickenBurger() {
        super("ChickenBurger");
    }

    @Override
    public long getPrice() {
        return 252;
    }
}
