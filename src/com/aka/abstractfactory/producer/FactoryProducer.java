package com.aka.abstractfactory.producer;

import com.aka.abstractfactory.AbstractFactory;
import com.aka.abstractfactory.exten.ColorFactory;
import com.aka.abstractfactory.exten.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
