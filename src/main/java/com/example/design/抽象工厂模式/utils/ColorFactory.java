package com.example.design.抽象工厂模式.utils;

import com.example.design.工厂模式.service.Shape;
import com.example.design.抽象工厂模式.service.color.Color;
import com.example.design.抽象工厂模式.service.color.impl.Blue;
import com.example.design.抽象工厂模式.service.color.impl.Green;
import com.example.design.抽象工厂模式.service.color.impl.Red;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 17:52
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
