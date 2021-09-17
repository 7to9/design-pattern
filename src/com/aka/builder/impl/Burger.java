package com.aka.builder.impl;

import com.aka.builder.Item;
import com.aka.builder.Packing;
import com.aka.builder.impl.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
