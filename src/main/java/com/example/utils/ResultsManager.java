package com.example.utils;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/8 14:01
 */
public class ResultsManager {
    public static <T> Results<T> success() {
        return Results.success();
    }

    public static <T> Results<T> success(T t) {
        return Results.success(t);
    }

    public static <T> Results<T> failed() {
        return Results.failure(null);
    }

    public static <T> Results<T> failed(String msg) {
        return Results.failure(null, msg);
    }

    public static <T> Results<T> paramError(String msg) {
        return Results.error(Code.ARGUMENT_VALID_EXCEPTION, msg, null);
    }

    //public static <T> Results<T> notFound() {
    //    return Results.errNotFound();
    //}

    public static <T> Results<T> failed(T data, String msg) {
        return Results.failure(data, msg);
    }
}
