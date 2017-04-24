package com.tu.design.pattern.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class Meal {

    private static final Logger logger = LoggerFactory.getLogger(Meal.class);

    private final List<Item> items = new ArrayList<>();

    public Meal() {
        // POJO
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        return items
            .parallelStream()
            .mapToLong(Item::getPrice)
            .sum();
    }

    public void showItems() {
        items.forEach(item -> logger.error("Item: {}, price: {}", item.getName(), item.getPrice()));
    }
}
