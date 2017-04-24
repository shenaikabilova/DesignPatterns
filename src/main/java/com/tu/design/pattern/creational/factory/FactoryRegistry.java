package com.tu.design.pattern.creational.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class FactoryRegistry {

    public static final FactoryRegistry INSTANCE = new FactoryRegistry();

    private final Map<String, ShapeFactory> factoryByType = new HashMap<>();

    private FactoryRegistry() {
        factoryByType.put("RECTANGLE", new RectangleFactory());
        factoryByType.put("SQUARE", new SquareFactory());
        factoryByType.put("CIRCLE", new CircleFactory());
    }

    public ShapeFactory getFactory(String shapeType) {
        return factoryByType.get(shapeType);
    }
}
