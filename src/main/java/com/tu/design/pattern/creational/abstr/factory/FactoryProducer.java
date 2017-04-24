package com.tu.design.pattern.creational.abstr.factory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        throw new IllegalArgumentException("Unknown shape: " + choice);
    }

}
