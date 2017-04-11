package com.tu.design.pattern.behaviour.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamen on 30.04.16
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
