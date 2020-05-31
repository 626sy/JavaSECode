package com.neusoft;

public class TestStudentDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        Student s2 = new Student("张四",19);
        Student s3 = new Student("张五",20);
        s1.show();
        s2.show();
        s3.show();
        Student.showNum();
    }
}
