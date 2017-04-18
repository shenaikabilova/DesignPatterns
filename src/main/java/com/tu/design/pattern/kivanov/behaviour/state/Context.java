package com.tu.design.pattern.kivanov.behaviour.state;

/**
 * @author Kamen on 30.04.16
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
