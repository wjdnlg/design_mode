package com.example.genericity.service.impl;

import com.example.genericity.service.Generator;

import java.util.Random;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/4/7 14:15
 */
public class TestGeneratorImpl implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};


    @Override
    public String Text() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }




    public static void main(String[] args) {
        TestGeneratorImpl testGenerator = new TestGeneratorImpl();
        String text = testGenerator.Text();
        System.out.println(text);

    }
}
