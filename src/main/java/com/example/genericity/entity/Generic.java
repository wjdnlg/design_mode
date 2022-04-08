package com.example.genericity.entity;

import lombok.Data;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/7 13:59
 */
@Data
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public Generic() {
    }
}
