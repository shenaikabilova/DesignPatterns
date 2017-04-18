package com.tu.design.pattern.kivanov.behaviour.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class MementoPatternDemo {

    private static final Logger logger = LoggerFactory.getLogger(MementoPatternDemo.class);

    public static void main(String[] args) {
        final Originator originator = new Originator();
        final CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        logger.error("Current State: {}", originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        logger.error("First saved State: {}", originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        logger.error("Second saved State: {}", originator.getState());
    }

}
