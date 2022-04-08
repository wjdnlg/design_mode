package com.example.design.抽象工厂模式.service.shape.impl;

import com.example.design.抽象工厂模式.service.shape.Shape;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 15:40
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
