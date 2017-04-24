package com.tu.design.pattern.creational.abstr.factory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        throw new IllegalArgumentException("Unknown shape: " + shapeType);
    }

    @Override
    protected Color getColor(String color) {
        return null;
    }
}