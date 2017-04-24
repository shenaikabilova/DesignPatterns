package com.tu.design.pattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class RedCircle implements DrawAPI {

    private static final Logger logger = LoggerFactory.getLogger(RedCircle.class);

    @Override
    public void drawCircle(int radius, int x, int y) {
        logger.error("Drowing Circle [color: red, radius: {}, x: {}, y: {}]", radius, x, y);
    }
}
