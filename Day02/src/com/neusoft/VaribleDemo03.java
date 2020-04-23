package com.neusoft;

import java.sql.SQLOutput;

public class VaribleDemo03 {
    public static void main(String[] args){
       int a;
       a = 20;
       System.out.println(a);
       //1.变量未赋值，不能使用

        {
            //大括号包裹起来的代码叫做代码块
            //代码块作用：让变量尽可能早的从内存消失，从而节约资源，提高效率
            //高级编程语言的时候，GC 垃圾回收机制
            double d = 22.22;
            System.out.println(d);
        }
        //2.此行代码会报错，变量d 从内存中已经消失，无法访问
//        System.out.println(d);
//        3.变量可以一次声明多个
        int e= 10,f = 20, h = 20;
        System.out.println(e);

//        python中声明多个变量
//        主攻Java（80%），辅修JavaScript和python（20%）
//        a, b, c = 10, 20 ,30


    }
}
