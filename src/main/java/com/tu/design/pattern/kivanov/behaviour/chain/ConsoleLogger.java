package com.tu.design.pattern.kivanov.behaviour.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class ConsoleLogger extends AbstractLogger {

    private static final Logger logger = LoggerFactory.getLogger(ConsoleLogger.class);

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        logger.error("Standard Console::Logger: {}", message);
    }
}
