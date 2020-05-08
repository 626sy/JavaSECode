package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 20:42
 */
public class Test03_StudentInfo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        System.out.println(studentInfo.getName());
        //调用方法
        studentInfo.setName("石浩博");
        studentInfo.setAge(21);
        //输出
        System.out.println(studentInfo.getName());
        System.out.println(studentInfo.getAge());
    }
}
