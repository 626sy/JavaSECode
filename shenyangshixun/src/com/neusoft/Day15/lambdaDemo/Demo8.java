package com.neusoft.Day15.lambdaDemo;

/**
 * @author shihaobo
 * @date 2020/7/30 19:46
 */
public class Demo8 {
    public static void main(String[] args) {
        invoke(()-> System.out.println("省略在做饭"));

    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
