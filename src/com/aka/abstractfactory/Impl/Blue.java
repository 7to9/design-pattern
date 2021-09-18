package com.aka.abstractfactory.Impl;

import com.aka.abstractfactory.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.---蓝色");
    }
}
