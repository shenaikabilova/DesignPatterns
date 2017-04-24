package com.tu.design.pattern.structural.bridge;

/**
 * @author Kamen on 30.04.16
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        final Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        final Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
