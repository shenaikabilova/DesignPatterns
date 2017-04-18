package com.tu.design.pattern.kivanov.behaviour.observer;

/**
 * @author Kamen on 30.04.16
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        logger.error("Octal String: {}", Integer.toOctalString(subject.getState()));
    }
}
