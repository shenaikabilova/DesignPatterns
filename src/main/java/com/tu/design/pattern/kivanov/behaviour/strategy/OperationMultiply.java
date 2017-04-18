package com.tu.design.pattern.kivanov.behaviour.strategy;

/**
 * @author Kamen on 30.04.16
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}