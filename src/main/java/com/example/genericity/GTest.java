package com.example.genericity;

import com.example.genericity.entity.Generic;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/7 13:41
 */
@Slf4j
public class GTest {

    public static void main(String[] args) {
        Generic<Integer> gInteger = new Generic<Integer>(123);
        Generic<Number> gNumber = new Generic<Number>(456);
        showKeyValue(gInteger);
        //test();
        //test1();
        test2();
    }

    private static void test() {
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for (int i = 0; i < arrayList.size(); i++) {
            String item = (String) arrayList.get(i);
            log.info("泛型测试", "item = {}", item);
        }
    }


    private static void test1() {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            log.info("泛型测试 类型相同");
        }
    }

    private static void test2() {
        Generic generic = new Generic("111111");
        Generic generic1 = new Generic(4444);
        Generic generic2 = new Generic(55.55);
        Generic generic3 = new Generic(false);

        Generic generic4 = new Generic();

    }


    private static void showKeyValue(Generic<?> obj) {
        System.out.println("泛型测试 key value is " + obj.getKey());
    }
}
