package com.example.design.抽象工厂模式.service.color.impl;

import com.example.design.抽象工厂模式.service.color.Color;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 17:37
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
