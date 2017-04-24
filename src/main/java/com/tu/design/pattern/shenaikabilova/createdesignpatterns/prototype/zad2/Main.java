package com.tu.design.pattern.shenaikabilova.createdesignpatterns.prototype.zad2;

/**
 * Created by ShenaiKabilova
 */
public class Main {
    public static void main(String[] args) {
        Figure figureRectangle = new Rectangle(5, 3);
        try {
            Figure cloneFigureRectangle = (Rectangle) figureRectangle.clone();
            cloneFigureRectangle.getInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Figure figureCirle = new Circle(4);
        try {
            Figure cloneFigureCircle = (Circle) figureCirle.clone();
            cloneFigureCircle.getInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
