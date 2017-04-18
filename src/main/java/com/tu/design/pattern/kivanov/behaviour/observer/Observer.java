package com.tu.design.pattern.kivanov.behaviour.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public abstract class Observer {

    protected static final Logger logger = LoggerFactory.getLogger(Observer.class);

    protected Subject subject;

    public abstract void update();

}
