package com.tu.design.pattern.behaviour.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public class Stock {

    private static final Logger logger = LoggerFactory.getLogger(Stock.class);

    private String name     = "ABC";
    private int    quantity = 10;

    public void buy() {
        logger.error("Stock [ Name: {}, Quantity: {}] bought", name, quantity);
    }

    public void sell() {
        logger.error("Stock [ Name: {}, Quantity: {}] sold", name, quantity);
    }
}
