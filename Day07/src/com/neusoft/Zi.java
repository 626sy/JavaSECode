package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/31 14:39
 */
public class Zi extends Fu {
    int num2 = 6;
//    public void show(){
//        System.out.println("Fu Num="+super.num);//调用父类的成员变量
//        System.out.println("Zi Num="+this.num2);//调用子类的成员变量
//    }
    //重写 父类的方法建议使用该注释进行标识
    @Override
    public void show(){
        System.out.println("zi类的show方法执行");
    }
}
