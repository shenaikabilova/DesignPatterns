package com.tu.design.pattern.behaviour.command;

/**
 * @author Kamen on 30.04.16
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}