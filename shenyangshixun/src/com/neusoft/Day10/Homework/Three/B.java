package com.neusoft.Day10.Homework.Three;

/**
 * @author shihaobo
 * @date 2020/7/24 22:30
 */
public class B implements A{
    public static void showD(){
        System.out.println("DDDD");
    }

    @Override
    public void showA() {
        System.out.println("AAA");
    }
}
