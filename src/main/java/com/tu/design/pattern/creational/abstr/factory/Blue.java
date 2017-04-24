package com.tu.design.pattern.creational.abstr.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Blue implements Color {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void fill() {
        logger.error("Inside Blue::fill() method.");
    }
}
