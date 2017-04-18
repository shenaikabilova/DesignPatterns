package com.tu.design.pattern.kivanov.behaviour.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class StartState implements State {

    private static final Logger logger = LoggerFactory.getLogger(StartState.class);

    public void doAction(Context context) {
        logger.error("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}