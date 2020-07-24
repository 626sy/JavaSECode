package com.neusoft.Day10.接口;

public  interface InterfaceDemo {
//    public void method();  //抽象的，abstract可以忽略
    //默认方法
    public default void method(){
        //执行语句
    }
    //静态方法
    public static void method1(){
        //执行语句
    }
    //私有方法
    private void method2(){
        //执行语句
    }
}



//私有方法：只有默认方法可以调用
//私有静态：默认方法和静态方法可以调用
