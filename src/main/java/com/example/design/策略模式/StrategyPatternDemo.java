package com.example.design.策略模式;

import com.example.design.策略模式.service.impl.OperationAdd;
import com.example.design.策略模式.service.impl.OperationMultiply;
import com.example.design.策略模式.service.impl.OperationSubstract;
import com.example.design.策略模式.utils.Context;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/23 15:55
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
