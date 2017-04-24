package com.tu.design.pattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class GreenCircle implements DrawAPI {

    private static final Logger logger = LoggerFactory.getLogger(GreenCircle.class);

    @Override
    public void drawCircle(int radius, int x, int y) {
        logger.error("Drowing Circle [color: green, radius: {}, x: {}, y: {}]", radius, x, y);
    }
}
