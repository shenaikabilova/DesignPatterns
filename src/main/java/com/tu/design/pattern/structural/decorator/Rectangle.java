package com.tu.design.pattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class Rectangle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        logger.error("Shape: Rectangle");
    }
}
