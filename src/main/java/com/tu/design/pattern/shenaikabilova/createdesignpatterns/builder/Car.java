package com.tu.design.pattern.shenaikabilova.createdesignpatterns.builder;

/**
 * Created by ShenaiKabilova
 */
public class Car {
    private String type;
    private String color;
    private int doorsNumber;
    private String engine;
    private int konskiSili;
    private String windowType;

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public String getEngine() {
        return engine;
    }

    public int getKonskiSili() {
        return konskiSili;
    }

    public String getWindowType() {
        return windowType;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setKonskiSili(int konskiSili) {
        this.konskiSili = konskiSili;
    }

    public void setWindowType(String windowType) {
        this.windowType = windowType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", doorsNumber=" + doorsNumber +
                ", engine='" + engine + '\'' +
                ", konskiSili=" + konskiSili +
                ", windowType='" + windowType + '\'' +
                '}';
    }
}
