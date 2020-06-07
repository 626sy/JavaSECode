package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/6/7 20:48
 */
public class FinalDemo1 {
    public static void main(String[] args) {
        // 声明一个变量使用final修饰
        final int al;
        al = 10;
        System.out.println(al);
        //al = 20; 报错,不可重新赋值
        final int b = 100;
        // b=111;  报错,不可重新赋值
    }
}

