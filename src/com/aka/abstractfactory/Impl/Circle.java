package com.aka.abstractfactory.Impl;

import com.aka.abstractfactory.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.---圆");
    }
}
