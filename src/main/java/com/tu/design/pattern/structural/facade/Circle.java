package com.tu.design.pattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class Circle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.error("Shape: Circle");
    }
}
