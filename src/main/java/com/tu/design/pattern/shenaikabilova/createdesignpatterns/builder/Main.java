package com.tu.design.pattern.shenaikabilova.createdesignpatterns.builder;

/**
 * Created by ShenaiKabilova
 */
public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder().defaultCarBuild();
        System.out.println(car.getType());

        Car newCar = new CarBuilder()
                    .setType("carType")
                    .setColor("red")
                    .build();
        System.out.print(newCar.toString());
    }
}
