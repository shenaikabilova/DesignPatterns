package com.tu.design.pattern.shenaikabilova.createdesignpatterns.builder;

/**
 * Created by ShenaiKabilova
 */
public class CarBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public CarBuilder setType(String type) {
        car.setType(type);
        return this;
    }

    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilder setDoorsNumber(int doorsNumber) {
        car.setDoorsNumber(doorsNumber);
        return this;
    }

    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    public CarBuilder setKonskiSili(int konskiSili) {
        car.setKonskiSili(konskiSili);
        return this;
    }

    public CarBuilder setWindowType(String windowType) {
        car.setWindowType(windowType);
        return this;
    }

    public Car build() {
        return car;
    }

    public Car defaultCarBuild() {
        return this.setType("sedan").setDoorsNumber(4).setEngine("denzinov").setKonskiSili(99).build();
    }
}
