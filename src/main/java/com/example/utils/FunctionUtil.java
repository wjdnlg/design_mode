package com.example.utils;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/8 14:00
 */
public class FunctionUtil {
    public static <T> T function(boolean result, BaseFunctionCallback<T> trueFunction, BaseFunctionCallback<T> falseFunction) {
        return result ? trueFunction.callback() : falseFunction.callback();
    }

    public static <T> T functionException(boolean result, BaseFunctionCallback<T> trueFunction, BaseFunctionCallback<T> falseFunction) throws Exception {
        return result ? trueFunction.callback() : falseFunction.callback();
    }

    //public static void voidFunction(boolean result, VoidFunctionCallback trueFunction, VoidFunctionCallback falseFunction) {
    //    if (result) {
    //        trueFunction.callback();
    //    }else {
    //        falseFunction.callback();
    //    }
    //}
}
