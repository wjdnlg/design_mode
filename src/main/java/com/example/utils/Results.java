package com.example.utils;


/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/8 14:01
 */
public class Results<T> {
    private int code;
    private String msg;
    private T data;
    private Object error;

    private Results(Code c) {
        this.code = c.getBCode();
        this.msg = c.getMsg();
    }

    private Results(Code c, String msg, T data) {
        this.code = c.getBCode();
        this.msg = msg;
        this.data = data;
    }

    private Results(Code c, String msg, T data, Object error) {
        this.code = c.getBCode();
        this.msg = msg;
        this.data = data;
        this.error = error;
    }

    private Results(Code c, T data) {
        this(c);
        this.data = data;
    }

    public static <T> Results<T> success(T data) {
        return new Results(Code.SUCCESS, data);
    }

    public static <T> Results<T> success() {
        return (Results<T>) success((Object) null);
    }

    public static <T> Results<T> failure(T data, String msg) {
        return new Results(Code.FAILURE, msg, data);
    }

    public static <T> Results<T> failure(T data) {
        return new Results(Code.FAILURE, data);
    }

    //public static <T> Results<T> failureNoData(String msg) {
    //    return failure((Object) null, msg);
    //}

    //public static <T> Results<T> failure() {
    //    return failure((Object) null);
    //}

    public static <T> Results<T> errNotFound(T data, String msg) {
        return new Results(Code.ITEM_NOT_FOUND, msg, data);
    }

    public static <T> Results<T> errNotFound(T data) {
        return new Results(Code.ITEM_NOT_FOUND, data);
    }

    //public static <T> Results<T> errNotFoundNoData(String msg) {
    //    return errNotFound((Object) null, msg);
    //}

    //public static <T> Results<T> errNotFound() {
    //    return errNotFound((Object) null);
    //}

    public static <T> Results<T> errConflict(T data, String msg) {
        return new Results(Code.ITEM_CONFLICT, msg, data);
    }

    public static <T> Results<T> errConflict(T data) {
        return new Results(Code.ITEM_CONFLICT, data);
    }

    //public static <T> Results<T> errConflictNoData(String msg) {
    //    return errConflict((Object) null, msg);
    //}

    //public static <T> Results<T> errConflict() {
    //    return errConflict((Object) null);
    //}

    public static <T> Results<T> errInternalServer(T data, String msg) {
        return new Results(Code.INTERNAL_SERVER, msg, data);
    }

    public static <T> Results<T> errInternalServer(T data) {
        return new Results(Code.INTERNAL_SERVER, data);
    }

    //public static <T> Results<T> errInternalServerNoData(String msg) {
    //    return errInternalServer((Object) null, msg);
    //}

    //public static <T> Results<T> errInternalServer() {
    //    return errInternalServer((Object) null);
    //}

    public static Results exception(Code code) {
        return new Results(code);
    }

    public static <T> Results<T> exception(Code code, T data) {
        return new Results(code, data);
    }

    public static <T> Results<T> exception(Code c, String msg, T data) {
        return new Results(c, msg, data);
    }

    public static Results error(Code code) {
        return new Results(code);
    }

    public static <T> Results<T> error(Code code, Object error) {
        return new Results(code, code.getMsg(), (Object) null, error);
    }

    public static <T> Results<T> error(Code c, String msg, Object error) {
        return new Results(c, msg, (Object) null, error);
    }

    public static <T> Results<T> error(Code c, String msg, T data, Object error) {
        return new Results(c, msg, data, error);
    }

    public boolean ifSuccess() {
        return Code.SUCCESS.getBCode() == this.getCode();
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public Object getError() {
        return this.error;
    }

    public Results() {
    }
}
