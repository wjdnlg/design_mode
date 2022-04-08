package com.example.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/25 17:51
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface ApiField {
    public String value() default "sss";
    public String name();
}
