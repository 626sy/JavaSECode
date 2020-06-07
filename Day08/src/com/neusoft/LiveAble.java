package com.neusoft;

public interface LiveAble {
    //静态方法的使用
    public static void run(){
        System.out.println("跑起来");
    }
//    public void run();

    //将func1和func2两个方法封装到默认方法func中
    //私有方法
    private void func1(){
        System.out.println("func1跑起来");
    }

    // func2
    private void func2(){
        System.out.println("func2跑起来");
    }
    default void func(){
        func1();
        func2();
    }

}
