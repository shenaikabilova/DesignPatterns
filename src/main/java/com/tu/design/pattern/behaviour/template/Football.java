package com.tu.design.pattern.behaviour.template;

/**
 * @author Kamen on 30.04.16
 */
public class Football extends Game {

    @Override
    void endPlay() {
        logger.error("Football Game Finished!");
    }

    @Override
    void initialize() {
        logger.error("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        logger.error("Football Game Started. Enjoy the game!");
    }
}
