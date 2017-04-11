package com.tu.design.pattern.behaviour.command;

/**
 * @author Kamen on 30.04.16
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        final Stock abcStock = new Stock();

        final BuyStock buyStockOrder = new BuyStock(abcStock);
        final SellStock sellStockOrder = new SellStock(abcStock);

        final Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
