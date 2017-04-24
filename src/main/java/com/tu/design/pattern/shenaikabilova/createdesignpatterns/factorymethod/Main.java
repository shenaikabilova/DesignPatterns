package com.tu.design.pattern.shenaikabilova.createdesignpatterns.factorymethod;

/**
 * Created by ShenaiKabilova
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape myShape = shapeFactory.getShape("circle");
        myShape.draw();
    }
}
