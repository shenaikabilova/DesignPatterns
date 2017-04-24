package com.tu.design.pattern.creational.abstr.factory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //get shape factory
        final AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        final Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        final Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        final Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        final AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        final Color red = colorFactory.getColor("RED");
        red.fill();

        final Color green = colorFactory.getColor("Green");
        green.fill();

        final Color blue = colorFactory.getColor("BLUE");
        blue.fill();
    }

}
