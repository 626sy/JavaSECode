package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 19:16
 */
public class Test02_Phone {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        //输出成员变量
        System.out.println("品牌："+ p.brand);
        System.out.println("价格："+ p.price);
        System.out.println("颜色："+ p.color);
        System.out.println("---------------------");
        //赋值
        p.brand = "华为";
        p.color = "green";
        p.price = 6666;
        //再次输出
        System.out.println("品牌："+ p.brand);
        System.out.println("价格："+ p.price);
        System.out.println("颜色："+ p.color);
        System.out.println("---------------------");
        //调用方法
        p.Called("石浩博");
        p.SendMessage();
        show(p);        //调用show方法
    }
//    对象作为参数进行传递
    public static void show(Phone p){
        System.out.println(p.brand +"  "+ p.price+"     "+ p.color);
    }
}
