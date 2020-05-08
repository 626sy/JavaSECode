package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 19:14
 * Phone类
 * 成员变量跟着类
 * 局部变量跟着方法
 */
public class Phone {
//    成员变量
    String brand;   //品牌
    int  price;     //价格
    String color;   //颜色
    //成员方法
    //给name打电话
    public void Called(String  name){
        System.out.println("给"+name+"打电话");
    }
    //发短信
    public void SendMessage(){
        System.out.println("发短信");
    }
}
