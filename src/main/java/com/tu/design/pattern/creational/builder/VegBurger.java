package com.tu.design.pattern.creational.builder;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class VegBurger extends Burger {

    public VegBurger() {
        super("VerBurger");
    }

    @Override
    public long getPrice() {
        return 125;
    }
}
