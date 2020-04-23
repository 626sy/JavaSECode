package com.neusoft;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/4/12 16:43
 */
public class Demo10 {
    public static void main(String[] args) {
        int ge, shi, bai,count = 0;
        for (int i = 100; i < 1000; i++) {
            ge = i / 1 % 10;
            shi = i / 10 % 10;
            bai = i / 100 % 10;
            if (i == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花数的个数为: " + count);


        //求1-100以内的奇数和，以及奇数的个数
/*        int sum = 0;
        int count = 0;
        for (int i=1;i<=100;i++){
            if (i%2 !=0){
                count++;
                sum = sum+i;
            }
        }
        System.out.println("奇数和为"+sum);
        System.out.println("奇数的个数为"+count);*/



        //把1-100之间的数字按照一行六个进行输出
/*
        for (int i=1;i <= 100;i++){
            System.out.print(i+"  ");
            if (i%6 == 0){
                System.out.println();
            }
        }
*/


        //按照从大到小的顺序输出个位+百位=十位+千位的数字及个数
        //每行输出5个满足条件的数，之后用空格分隔
/*        int count = 0;
        System.out.println("满足条件的数为：");
        for (int i = 9999;i >=1000;i--){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            int qian = i/1000;
            if (ge + bai == shi + qian){
                System.out.print(i+" ");
                count++;
                if (count%5 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("满足条件的个数为"+count);*/


        //录入一个大于100的三位数，求与100之间满足各位数不为7，十位数不为5，百位数不为3的数字之和
/*        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数：");
        int num = sc.nextInt();
        int sum = 0;
        for (int i=100;i<num;i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if (ge != 7 || shi != 5 || bai !=3){
                sum += i;
            }
        }
        System.out.println("该数与100之间满足条件的数字之和为："+sum);*/

    }
}
