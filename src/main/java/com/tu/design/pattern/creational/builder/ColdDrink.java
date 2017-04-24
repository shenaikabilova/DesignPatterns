package com.tu.design.pattern.creational.builder;

/**
 * Created by kamen on 8.3.2017 г.
 */
public abstract class ColdDrink implements Item {

    private final String name;

    public ColdDrink(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
