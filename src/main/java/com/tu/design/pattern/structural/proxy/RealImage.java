package com.tu.design.pattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class RealImage implements Image {

    private static final Logger logger = LoggerFactory.getLogger(RealImage.class);

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        logger.error("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        logger.error("Loading " + fileName);
    }
}
