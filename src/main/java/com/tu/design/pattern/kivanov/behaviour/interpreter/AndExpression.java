package com.tu.design.pattern.kivanov.behaviour.interpreter;

/**
 * @author Kamen on 30.04.16
 */
public class AndExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}