package com.neusoft.Day13;

/**
 * @author shihaobo
 * @date 2020/7/28 14:06
 */
public class BaoZhuangDemo {
    public static void main(String[] args) {
//        Integer i = new Integer(4);   //基本 ==》 包装
//        int i1 = i.intValue();    //包装类 基本


        Integer i = 5;  //自动装箱
        i = i + 5; // 自动拆箱
        int a = 100;
        System.out.println("a的值" + a);
    }
}
