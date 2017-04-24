package com.tu.design.pattern.creational.factory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape makeShape() {
        return new Square();
    }
}
