package com.tu.design.pattern.creational.abstr.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Circle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.error("Inside Square::draw() method.");
    }
}
