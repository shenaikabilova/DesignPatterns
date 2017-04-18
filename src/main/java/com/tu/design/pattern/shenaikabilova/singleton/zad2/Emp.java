package com.tu.design.pattern.shenaikabilova.singleton.zad2;

/**
 * Created by ShenaiKabilova
 */
public class Emp {
    private static Emp instance;

    private int number;
    private String name;
    private float salary;

    private Emp (int number, String name, float salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public static Emp empGetInstance(int number, String name, float salary) {
        if(instance == null) {
            instance = new Emp(number, name, salary);
        }

        return instance;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", salary=" + salary  +
                '}';
    }
}
