package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/31 14:39
 */
public class Zi extends Fu {
    int num2 = 6;
    public void show(){
        System.out.println("Fu Num="+super.num);//调用父类的成员变量
        System.out.println("Zi Num="+this.num2);//调用子类的成员变量
    }
}
