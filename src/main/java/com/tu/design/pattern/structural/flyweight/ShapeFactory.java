package com.tu.design.pattern.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kamen on 30.04.16
 */
public class ShapeFactory {

    private static final Logger logger = LoggerFactory.getLogger(ShapeFactory.class);

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            logger.error("Creating circle of color : " + color);
        }
        return circle;
    }
}
