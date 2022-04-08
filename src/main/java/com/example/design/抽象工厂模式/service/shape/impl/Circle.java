package com.example.design.抽象工厂模式.service.shape.impl;

import com.example.design.抽象工厂模式.service.shape.Shape;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 15:42
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
