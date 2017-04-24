package com.tu.design.pattern.shenaikabilova.createdesignpatterns.prototype.zad1;

/**
 * Created by ShenaiKabilova
 */
public abstract class Prototype implements Cloneable{
    private int id;

    public Prototype(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}
