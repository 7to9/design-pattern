package com.aka.builder.impl.impl;

import com.aka.builder.impl.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 23.0F;
    }
}
