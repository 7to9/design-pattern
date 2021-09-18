package com.aka.abstractfactory.Impl;

import com.aka.abstractfactory.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.---绿色");
    }
}
