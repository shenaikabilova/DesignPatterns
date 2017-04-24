package com.tu.design.pattern.behaviour.template;

/**
 * @author Kamen on 30.04.16
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }

}
