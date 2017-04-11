package com.tu.design.pattern.behaviour.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class FileLogger extends AbstractLogger {

    private static final Logger logger = LoggerFactory.getLogger(FileLogger.class);

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        logger.error("File::Logger: {}", message);
    }
}