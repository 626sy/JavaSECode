package com.neusoft.Day10.接口;

/**
 * @author shihaobo
 * @date 2020/7/24 14:35
 */
public class Animal implements LiveAble {
    // 无法重写静态方法
    @Override
    public void eat() {
        System.out.println("就知道吃");

    }

    @Override
    public void sleep() {
        System.out.println("还睡啊");
    }

//    @Override
//    public void fly() {
//        System.out.println("左右飞");
//    }

}
