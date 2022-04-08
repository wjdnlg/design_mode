package com.example.design.抽象工厂模式.utils;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 17:53
 */
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
