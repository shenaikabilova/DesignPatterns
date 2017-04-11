package com.tu.design.pattern.behaviour.interpreter;

/**
 * @author Kamen on 30.04.16
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}