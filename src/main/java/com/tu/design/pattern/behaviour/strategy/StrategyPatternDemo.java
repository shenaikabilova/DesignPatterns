package com.tu.design.pattern.behaviour.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class StrategyPatternDemo {


    private static final Logger logger = LoggerFactory.getLogger(StrategyPatternDemo.class);


    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        logger.error("10 + 5 = {}", context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        logger.error("10 - 5 = {}", context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        logger.error("10 * 5 = {}", context.executeStrategy(10, 5));
    }

}
