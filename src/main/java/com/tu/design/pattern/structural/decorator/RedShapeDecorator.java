package com.tu.design.pattern.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class RedShapeDecorator extends ShapeDecorator {

    private static final Logger logger = LoggerFactory.getLogger(RedShapeDecorator.class);

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        logger.error("Border Color: Red");
    }
}