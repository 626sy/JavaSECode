package com.neusoft;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/5/10 15:48
 */
public class Test01Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //输入两个数，求两个数的和
        System.out.println("请分别输入两个数");
        int i = s.nextInt();
        int j = s.nextInt();
        int k = i+ j;
        System.out.println("两个数的和为："+k);
        //录入三个数求最大值
        System.out.println("请输入第一个数据：");
        int a = s.nextInt();
        System.out.println("请输入第二个数据：");
        int b = s.nextInt();
        System.out.println("请输入第三个数据：");
        int c = s.nextInt();
        //方法一：
/*        int max = a;
        if (a > b && a > c) {
            max = a;
        } else if(b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("最大值: " + max);*/

        //方法二：
        int temp =(a > b ? a:b);
        int max = (temp > c? temp:c);
        System.out.println("max:"+ max);
    }



    //匿名对象，（没有名的对象） 只创建对象语句，没有把对象地址赋值给某个变量
/*    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        //这是匿名对象的创建  优点：简洁
        System.out.println(new Scanner(System.in).nextInt());
        //匿名对象的缺点：一旦调用两次成员方法，就创建了两个对象，造成了浪费
    }*/
}
