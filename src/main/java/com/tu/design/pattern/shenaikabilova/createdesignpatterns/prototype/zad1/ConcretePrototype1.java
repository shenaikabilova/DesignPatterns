package com.tu.design.pattern.shenaikabilova.createdesignpatterns.prototype.zad1;

/**
 * Created by ShenaiKabilova
 */
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(int id) {
        super(id);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
