package com.neusoft.Day15.lambdaDemo;

/**
 * @author shihaobo
 * @date 2020/7/30 19:47
 */
public class Demo {
    public static void main(String[] args) {
        Cook cook = new CookImpl();
        invoke(cook);
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
