package com.tu.design.pattern.creational.abstr.factory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public abstract class AbstractFactory {

    protected abstract Color getColor(String color);
    protected abstract Shape getShape(String shape) ;

}
