package com.tu.design.pattern.creational.factory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape makeShape() {
        return new Rectangle();
    }
}
