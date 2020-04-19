package com.neusoft;
import java.util.Random;
import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/4/19 16:30
 * 打印1天内 所有的时间格式
 * 格式是12时43分
 */

public class ForForDemo06 {
    //打印矩阵3 x 5
    //外层负责换行，里层负责打印每一行的内容
    public static void main(String[] args) {
/*        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//正三角
/*        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


//倒三角
/*        for (int i = 0; i <=5 ; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//九九乘法表
/*        for (int i = 1; i<= 9 ; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i + "*" + j + "=" + i*j+"\t");
            }
            System.out.println();
        }*/

    //求1-100之间的所有质数，并按3个一行的形式进行输出
        int count = 0;
        a:for (int i = 2; i <100 ; i++) {
            for (int j = 2; j < i-1; j++) {
                if (i%j == 0){
                    continue a;
                }
            }
            System.out.print(i+"\t");
            count++;
            if (count%3==0){
                System.out.println();
            }


        }


        //生成5-10以内的随机数
/*        Random random = new Random();
        int num;
        for (int i = 1; i <= 5; i++) {
            num = random.nextInt(10);
            System.out.println(num);
        }*/

        //随即职业

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的名字：");
        String name = sc.next();
        int num = r.nextInt(6);
        String zhiye = "";
        switch (num){
            case 0:
                zhiye = "宰相";
                break;
            case 1:
                zhiye = "一品带刀侍卫";
                break;
            case 2:
                zhiye = "皇帝";
                break;
            case 3:
                zhiye = "大内总管";
                break;
            case 4:
                zhiye = "店小二";
                break;
            case 5:
                zhiye = "江湖郎中";
                break;
            default:
                System.out.println("江湖郎中");
                break;

        }
        System.out.println(name + "前十为" +zhiye);

//生成1-100间的随机数，让用户猜
  /*      Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入1-100以内的任意一个随机数");
        int num = r.nextInt(100);
        int guess = sc.nextInt();
        if (guess>num){
            System.out.println("您猜的数据大了"+"生成的随机数为"+num);
        }else if (guess<num){
            System.out.println("您猜的数据小了"+"生成的随机数为"+num);
        }else {
            System.out.println("gong'xi'nin猜中了");
        }*/



    }
    
}
