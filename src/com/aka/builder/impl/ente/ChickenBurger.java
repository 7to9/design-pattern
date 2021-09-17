package com.aka.builder.impl.ente;

import com.aka.builder.impl.Burger;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5F;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
