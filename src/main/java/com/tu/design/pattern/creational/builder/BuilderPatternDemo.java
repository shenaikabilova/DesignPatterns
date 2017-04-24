package com.tu.design.pattern.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class BuilderPatternDemo {

    private static final Logger logger = LoggerFactory.getLogger(BuilderPatternDemo.class);

    public static void main(String[] args) {
        final MealBuilder mealBuilder = new MealBuilder();

        final Meal vegMeal = mealBuilder.prepareVegMeal();
        logger.error("Veg Meal");
        vegMeal.showItems();
        logger.error("Total Cost: " + vegMeal.getCost());

        final Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        logger.error("\nNon-Veg Meal");
        nonVegMeal.showItems();
        logger.error("Total Cost: " + nonVegMeal.getCost());
    }

}
