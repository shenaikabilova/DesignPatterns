package com.tu.design.pattern.structural.composite;

/**
 * @author Kamen on 30.04.16
 */
public class CompositePatternDemo {
    public static void main(String[] args) {

        User CEO = new User("John", "CEO", 30000);

        User headSales = new User("Robert", "Head Sales", 20000);

        User headMarketing = new User("Michel", "Head Marketing", 20000);

        User clerk1 = new User("Laura", "Marketing", 10000);
        User clerk2 = new User("Bob", "Marketing", 10000);

        User salesExecutive1 = new User("Richard", "Sales", 10000);
        User salesExecutive2 = new User("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (User headUser : CEO.getSubordinates()) {
            System.out.println(headUser);

            headUser.getSubordinates().forEach(System.out::println);
        }
    }
}
