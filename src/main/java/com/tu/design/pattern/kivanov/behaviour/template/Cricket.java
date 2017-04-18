package com.tu.design.pattern.kivanov.behaviour.template;

/**
 * @author Kamen on 30.04.16
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        logger.error("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        logger.error("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        logger.error("Cricket Game Started. Enjoy the game!");
    }
}

