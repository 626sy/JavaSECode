package com.neusoft.Day10.Student;

/**
 * @author shihaobo
 * @date 2020/7/24 9:27
 */
public class Student {
    private String name;
    private int age;
    // 学号
    private int sid;
    //类变量， 记录学生数量
    public static int numberOFStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOFStudent;
    }
    public void show(){
        System.out.println("学员： name = "+this.name+",age= "+ this.age+",sid ="+sid);
    }
}
