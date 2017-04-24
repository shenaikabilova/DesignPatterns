package com.tu.design.pattern.creational.builder;

/**
 * Created by kamen on 8.3.2017 г.
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        final Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        final Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
