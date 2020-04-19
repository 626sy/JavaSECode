package com.neusoft;
//
import java.util.Random;

/**
 * @author shihaobo
 * @date 2020/4/19 16:53
 */
public class RandomDemo05 {
    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();
        //调用随机数方法
        //生成【0， num】 0~num之间的任意整数 不高考num
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);
            System.out.println(num);
        }
        //生成（0~1）之间任意的浮点数
        double aDouble = random.nextDouble();
        System.out.println(aDouble);
        //生成改率均等的布尔值
        boolean b = random.nextBoolean();
        System.out.println(b);
    }

}
