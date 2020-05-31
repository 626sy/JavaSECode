package com.neusoft;

public class Student {
    // 类变量
    private  int numID;
    private String name;
    private int age;

    // 类变量 记录学生数量 分配学号
    public static int numberOfStudent = 0;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
        this.numID = ++numberOfStudent;
    }
    public void show(){
        System.out.println("student: name" + name +",age = " + age + ",numID: " + numID);
    }
    public static void showNum(){
        System.out.println("num： " + numberOfStudent);
    }
    // 静态方法只能访问静态成员
}
