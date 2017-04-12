package com.tu.design.pattern.behaviour.memento;

/**
 * @author Kamen on 30.04.16
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
