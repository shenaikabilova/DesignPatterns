package com.tu.design.pattern.creational.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Square implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Square.class);

    @Override
    public void draw() {
        logger.error("Inside Square::draw() method.");
    }

}
