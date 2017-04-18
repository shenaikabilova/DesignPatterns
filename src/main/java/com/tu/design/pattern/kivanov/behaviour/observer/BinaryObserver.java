package com.tu.design.pattern.kivanov.behaviour.observer;

/**
 * @author Kamen on 30.04.16
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        logger.error("Binary String: {}", Integer.toBinaryString(subject.getState()));
    }
}
