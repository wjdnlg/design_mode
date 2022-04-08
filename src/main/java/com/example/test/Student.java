package com.example.test;

import lombok.Data;

/**
 * @author zjd
 * @version 1.0
 * @date 2022/3/25 17:52
 */

public class Student {


    private String studentId;
    private String studentName;



    public String getStudentId() {
        return studentId;
    }
    @ApiField(name="student_id")
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    @ApiField(name="student_name")
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
