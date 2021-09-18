package com.aka.abstractfactory.Impl;

import com.aka.abstractfactory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.---长方形");
    }
}
