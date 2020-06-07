package com.neusoft.homework2;

/**
 * @author shihaobo
 * @date 2020/6/7 20:10
 */
public class B implements A {

    @Override
    public void showA() {
        System.out.println("AAA");
    }

    public static void showD(){
        System.out.println("DDDD");
    }
}
