package com.tu.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamen on 30.04.16
 */
public class User {

    private String name;
    private String dept;
    private int    salary;
    private List<User> subordinates = new ArrayList<>();

    public User() {
        // POJO
    }

    public User(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void add(User user) {
        subordinates.add(user);
    }

    public void remove(User user) {
        subordinates.remove(user);
    }

    public List<User> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "User{" +
            "dept='" + dept + '\'' +
            ", name='" + name + '\'' +
            ", salary=" + salary +
            ", subordinates=" + subordinates +
            '}';
    }

}
