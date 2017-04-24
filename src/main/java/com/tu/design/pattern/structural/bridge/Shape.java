package com.tu.design.pattern.structural.bridge;

/**
 * @author Kamen on 30.04.16
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
    
}
