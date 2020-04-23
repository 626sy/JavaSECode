package com.neusoft;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
//        录入1-7之间的数字，并接收，根据数字打印对应的星期
//        System.out.println("请输入1-7之间的整数");
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if(number>=1 && number<=7){
//            if (number == 1){
//                System.out.println("星期一");
//            }else if (number == 2){
//                System.out.println("星期二");
//            }else if (number == 3){
//                System.out.println("星期三");
//            }else if (number == 4){
//                System.out.println("星期四");
//            }else if (number == 5){
//                System.out.println("星期五");
//            }else if (number == 6){
//                System.out.println("星期六");
//            }else if (number == 7){
//                System.out.println("星期日");
//            }
//        }else{
//            System.out.println("没有这样的日期");
//        }
//
//
////小明礼物分配
//        System.out.println("输入小明的成绩：");
//        int grade = sc.nextInt();
//        if (grade < 80 && grade > 0){
//            System.out.println("被胖揍一顿");
//        }else if (grade>=80 && grade<= 89){
//            System.out.println("变形金刚玩具一个");
//        }else if (grade>=90 && grade<= 94){
//            System.out.println("游乐场玩一次");
//        }else if (grade>=95 && grade<= 100){
//            System.out.println("山地自行车一辆");
//        }else {
//            System.out.println("无效成绩");
//        }

//        三个整数求最大值
//        方式一
        System.out.println("请输入三个整数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >=b && a >=c){
            System.out.println("最大值为"+a);
        }else if (b >=a && b >=c){
            System.out.println("最大值为"+b);
        }else {
            System.out.println("最大值为"+c);
        }
//        方式二

        int max2 = a;
        if (a > b) {
            if (a > c){
                max2 = a;
            }else {
                max2 = c;
            }
        }


    }
}
