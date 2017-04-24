package com.tu.design.pattern.structural.bridge;

/**
 * @author Kamen on 30.04.16
 */
public class Circle extends Shape {

    private int x;
    private int y;
    private int radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
