package com.tu.design.pattern.shenaikabilova.createdesignpatterns.prototype.zad1;

/**
 * Created by ShenaiKabilova
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype1 p1 = new ConcretePrototype1(1);
        ConcretePrototype1 c1 = null;
        try {
            c1 = (ConcretePrototype1) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        ConcretePrototype2 p2 = new ConcretePrototype2(2);
        ConcretePrototype2 c2 = null;
        try {
            c2 = (ConcretePrototype2) p2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Clone c1: " + c1.getId());
        System.out.println("Clone c2: " + c2.getId());
    }
}
