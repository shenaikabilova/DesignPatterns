package com.tu.design.pattern.kivanov.behaviour.observer;

/**
 * @author Kamen on 30.04.16
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        logger.error("Hex String: ", Integer.toHexString(subject.getState()).toUpperCase());
    }
}