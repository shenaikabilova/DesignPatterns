package com.tu.design.pattern.shenaikabilova.singleton.zad2;

/**
 * Created by ShenaiKabilova
 */
public class Main2 {
    public static void main (String[] args) {
        Emp emp1 = Emp.empGetInstance(1, "A", 10);
        Emp emp2 = Emp.empGetInstance(2, "B", 20);
        Emp emp3 = Emp.empGetInstance(3, "C", 30);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
