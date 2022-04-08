package com.example.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/25 17:55
 */
public class test {
    public static void main(String[] args) {
        //Student student=new Student();
        //student.setStudentId("1111");
        //student.setStudentName("张三");
        //
        ////System.out.println(student.getStudentName());
        //
        //String s = JSON.toJSONString(student);
        //
        //System.out.println(s);

        String jsonStr = "{\"student_id\":\"1111\",\"student_name\":\"张三\"}";
        Object parse = JSON.parse(jsonStr);
        System.out.println(parse);



        //System.out.println(student1);

    }
}
