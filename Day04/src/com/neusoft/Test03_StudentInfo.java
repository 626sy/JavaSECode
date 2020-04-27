package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 20:42
 */
public class Test03_StudentInfo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        System.out.println(studentInfo.getName());
        studentInfo.setName("石浩博");
        System.out.println(studentInfo.getName());

    }
}
