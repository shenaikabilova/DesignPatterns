package com.tu.design.pattern.behaviour.mediator;

/**
 * @author Kamen on 30.04.16
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        final User robert = new User("Robert");
        final User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
