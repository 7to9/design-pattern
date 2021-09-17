package com.aka.builder.impl;

import com.aka.builder.Item;
import com.aka.builder.Packing;
import com.aka.builder.impl.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
