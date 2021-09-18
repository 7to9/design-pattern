package com.aka.abstractfactory.Impl;

import com.aka.abstractfactory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.---正方形");
    }
}
