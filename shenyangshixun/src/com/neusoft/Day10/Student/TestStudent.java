package com.neusoft.Day10.Student;

/**
 * @author shihaobo
 * @date 2020/7/24 9:31
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("王青松",22);
        Student s2 = new Student("刘伯挺",21);
        Student s3 = new Student("聂超",20);
        s1.show();
        s2.show();
        s3.show();
        //访问类变量
        System.out.println(Student.numberOFStudent);
        //调用静态方法

    }
}
