package com.example.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.utils.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;


/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/25 17:55
 */
public class test {
    public static void main(String[] args) {
        //Results<Student> test = test();

        //System.out.println(test.getCode());
        //System.out.println(test.getMsg());
        //System.out.println(test.getData());
        //System.out.println(test.getError());


        //
        ////System.out.println(student.getStudentName());
        //
        //String s = JSON.toJSONString(student);
        //
        //System.out.println(s);

        //String jsonStr = "{\"student_id\":\"1111\",\"student_name\":\"张三\"}";
        //Object parse = JSON.parse(jsonStr);
        //System.out.println(parse);


        //System.out.println(student1);


        BaseFunctionCallbackByParam baseFunctionCallbackByParam = test2();

        Student s = (Student) baseFunctionCallbackByParam.callback(1);

        System.out.println(s.getStudentName());

    }

    private static Results<Student> test() {
        Student student = new Student();
        student.setStudentId("1111");
        student.setStudentName("张三");
        return FunctionUtil.function(student != null, () -> ResultsManager.success(student), () -> ResultsManager.failed("未找到对应数据，请联系现场管理员"));

    }

    private static void test1() {
        BaseFunctionCallback callback = () -> {
            Student student = new Student();
            return student;
        };


    }

    private static BaseFunctionCallbackByParam test2() {

        BaseFunctionCallbackByParam callback = s -> {
            Integer i = Integer.valueOf(s.toString());
            if (i == 1) {
                s = "张三";
            }
            Student student = new Student();
            student.setStudentName(s.toString());
            return student;
        };
        return callback;
    }


}
