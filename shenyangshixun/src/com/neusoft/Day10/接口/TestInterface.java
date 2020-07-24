package com.neusoft.Day10.接口;

/**
 * @author shihaobo
 * @date 2020/7/24 14:36
 */
public class TestInterface {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.fly(); //调用默认方法
        LiveAble.run();

    }
}
