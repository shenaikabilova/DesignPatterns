package com.tu.design.pattern.behaviour.strategy;

/**
 * @author Kamen on 30.04.16
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}