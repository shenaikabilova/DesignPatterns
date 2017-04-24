package com.tu.design.pattern.creational.builder;

/**
 * Created by kamen on 8.3.2017 г.
 */
public abstract class Burger implements Item {

    private String name;

    public Burger(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
