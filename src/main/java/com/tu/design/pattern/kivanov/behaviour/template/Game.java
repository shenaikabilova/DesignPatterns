package com.tu.design.pattern.kivanov.behaviour.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kamen on 30.04.16
 */
public abstract class Game {

    protected static final Logger logger = LoggerFactory.getLogger(Game.class);

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }

}
