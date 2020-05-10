package com.neusoft;

import java.util.Random;
import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/5/10 16:58
 *
 */
public class Test02Random {
    public static void main(String[] args) {
        //游戏开始生成一个1-100之间的随机整数number，玩家猜测一个数组guessNumber
        //系统提示猜大了还是猜小了，直到玩家猜对
        Random random = new Random();
        int number = random.nextInt(100)+1;

        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("请猜测1-100间的任意一个数");
            int guessnumber = s.nextInt();
            if (guessnumber>number){
                System.out.println("您猜的数字大了");
            }else if (guessnumber<number){
                System.out.println("您猜的数字小了");
            }else {
                System.out.println("恭喜您猜中了");
                break;
            }
        }
    }
}


/*// 导包
import java.util.Random;
public class Test02Random {
    public static void main(String[] args) {
// 系统产生一个随机数1‐100之间的。
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        while(true){
// 键盘录入我们要猜的数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字(1‐100)：");
            int guessNumber = sc.nextInt();
// 比较这两个数据(用if语句)
            if (guessNumber > number) {
                System.out.println("你猜的数据" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数据" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你,猜中了");
                break;
            }
        }
    }
}*/
