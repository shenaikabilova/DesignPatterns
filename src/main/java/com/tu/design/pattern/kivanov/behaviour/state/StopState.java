package com.tu.design.pattern.kivanov.behaviour.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class StopState implements State {

    private static final Logger logger = LoggerFactory.getLogger(StopState.class);

    public void doAction(Context context) {
        logger.error("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
