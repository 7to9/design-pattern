package com.aka.abstractfactory.Impl;

import com.aka.abstractfactory.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.---红色");
    }
}
