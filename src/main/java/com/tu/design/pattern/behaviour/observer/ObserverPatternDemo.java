package com.tu.design.pattern.behaviour.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class ObserverPatternDemo {


    protected static final Logger logger = LoggerFactory.getLogger(ObserverPatternDemo.class);

    public static void main(String[] args) {
        final Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        logger.error("First state change: 15");
        subject.setState(15);
        logger.error("Second state change: 10");
        subject.setState(10);
    }

}
