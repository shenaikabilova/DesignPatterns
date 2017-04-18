package com.tu.design.pattern.kivanov.behaviour.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class StatePatternDemo {

    private static final Logger logger = LoggerFactory.getLogger(StatePatternDemo.class);

    public static void main(String[] args) {
        final Context context = new Context();

        final StartState startState = new StartState();
        startState.doAction(context);

        logger.error(context.getState().toString());

        final StopState stopState = new StopState();
        stopState.doAction(context);

        logger.error(context.getState().toString());
    }

}
