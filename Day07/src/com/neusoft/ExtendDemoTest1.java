package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/31 14:30
 */
public class ExtendDemoTest1 {
    public static void main(String[] args) {
        teacher teacher = new teacher();

        //属性赋值
        teacher.name = "小明";
        //调用 printName方法
        teacher.printName();
        // 调用父类的方法
        teacher.work();
    }
}
