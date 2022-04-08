package com.example.design.策略模式.service.impl;

import com.example.design.策略模式.service.Strategy;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 15:53
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
