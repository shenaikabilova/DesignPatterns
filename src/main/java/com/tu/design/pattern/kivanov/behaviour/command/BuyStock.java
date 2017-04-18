package com.tu.design.pattern.kivanov.behaviour.command;

/**
 * @author Kamen on 30.04.16
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
