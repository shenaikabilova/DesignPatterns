package com.tu.design.pattern.creational.factory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        //get an object of Circle and call its draw method.
        final Shape circle = FactoryRegistry.INSTANCE.getFactory("CIRCLE").makeShape();

        //call draw method of Circle
        circle.draw();

        //get an object of Rectangle and call its draw method.
        final Shape rectangle = FactoryRegistry.INSTANCE.getFactory("RECTANGLE").makeShape();

        //call draw method of Rectangle
        rectangle.draw();

        //get an object of Square and call its draw method.
        final Shape square = FactoryRegistry.INSTANCE.getFactory("SQUARE").makeShape();

        //call draw method of circle
        square.draw();
    }

}
