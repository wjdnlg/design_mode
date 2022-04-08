package com.example.design.抽象工厂模式.utils;

import com.example.design.工厂模式.service.Shape;
import com.example.design.抽象工厂模式.service.color.Color;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 17:44
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
