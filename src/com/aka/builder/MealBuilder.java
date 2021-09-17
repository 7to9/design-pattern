package com.aka.builder;

import com.aka.builder.impl.ente.ChickenBurger;
import com.aka.builder.impl.ente.Coke;
import com.aka.builder.impl.ente.Pepsi;
import com.aka.builder.impl.ente.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
