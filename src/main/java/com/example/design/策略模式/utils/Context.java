package com.example.design.策略模式.utils;

import com.example.design.策略模式.service.Strategy;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 15:55
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
