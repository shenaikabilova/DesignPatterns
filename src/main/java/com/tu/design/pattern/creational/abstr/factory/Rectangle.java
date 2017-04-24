package com.tu.design.pattern.creational.abstr.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Rectangle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        logger.error("Inside Rectangle::draw() method.");
    }
}
