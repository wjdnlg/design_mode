package com.example.utils;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/8 14:34
 */
public interface BaseFunctionCallbackByParam<T, V> extends BaseFunction {

    T callback(V param);

    //V callback1(T param);
}
