package com.neusoft.Day10.接口;

public interface LiveAble {
//    定义抽象方法
    public abstract void eat();
    public abstract void sleep();
    //定义默认方法
    public default void fly(){
        System.out.println("上下非");
        func1();
        func2();
    }
    //定义静态方法
    public static void run(){
        System.out.println("嗷嗷跑");
    }
    //私有方法
    private void func1(){
        System.out.println("func1");
    }
    private void func2(){
        System.out.println("func2");
    }
}
