package com.neusoft;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {
//        switch (表达式){
//            case 值1;
//        System.out.println("请输入小明的成绩");
//        int grade = sc.nextInt();
//        if (grade >=0 && grade <=100){
//            switch (grade/10){
//                case 10:
//                case 9:
//                    System.out.println("山地自行车一辆");
//                    break;
//                case 8:
//                    System.out.println("游乐场玩一次");
//                    break;
//                case 7:
//                    System.out.println("变形经玩具一个");
//                    break;
//                default:
//                    System.out.println("胖揍一顿");
////                    break;
//            }
//    }else {
//            System.out.println("无效成绩");
//        }
        //快捷键 alt + enter: 快速导包
        //ctrl + y :删除光标所在行
        //ctrl + d :复制当前行,直接复制到下一行
        //ctrl + alt +l :格式化代码
        //ctrl + / :注释当前行
        //ctrl + shift +/:注释多行
        //enter + shift+上下键:上下移动
        Scanner sc = new Scanner(System.in);
/*        System.out.println("请输入工龄：");
        int age = sc.nextInt();
        System.out.println("请输入基本工资：");
        int pay = sc.nextInt();
        int add = 0;

         if (age>0 && age<=15){
             if (age>=10 &&age<15){
                 add = 5000;
             }else if (age>=5 &&age<10){
                 add = 2500;
             }else if (age>=3 &&age<5){
                 add = 1000;
             }else if (age>=1 &&age<3){
                 add = 500;
             }else {
                 add = 200;
             }
             int sum= pay+add;

             System.out.println("您目前工作了"+age+"年，基本工资为"+pay+"元，应涨工资为"+add+"元，账后工资为"+sum+"元");
         }else {
             System.out.println("工龄错误");
         }*/

/*
        System.out.println("请输入第一个整数");
        int a =sc.nextInt();
        System.out.println("请输入第二个整数");
        int b =sc.nextInt();
        System.out.println("请输入您要进行的运算");
        int type=sc.nextInt();
        double result= 0;


        switch(type) {
            case 0://做加法
                result = a + b;
                System.out.println(a+"+"+b+"="+result);
                break;
            case 1:
                result = a - b;
                System.out.println(a+"-"+b+"="+result);
                break;
            case 2:
                result = a * b;
                System.out.println(a+"*"+b+"="+result);
                break;
            case 3:

                result = a / b;
                System.out.println(a+"/"+b+"="+result);
                break;
            default:
                System.out.println("您输入有误");
        }
*/

        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();
        int a=number%10;
        int b=number/10%10;
        int c=number/100;
        int sum = a*a*a+b*b*b+c*c*c;
/*        if (number == sum){
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是水仙花数");
        }*/
        //三目运算符
        //（关系表达式）？表达式1：表达式2
        //先执行关系表达式，看起结果是true，还是false
        //如果true-->表达式1
        //如果false-->表达式2
        boolean flag = (number == sum)?true:false;
        System.out.println("是水仙花数吗"+true);


/*

        System.out.println("请输入小明左手中的纸牌：");
        int left = sc.nextInt();
        System.out.println("请输入小明左手中的纸牌：");
        int right = sc.nextInt();
        System.out.println("互换前小明左手中的纸牌：");
        System.out.println("左手中的纸牌"+left);
        System.out.println("右手中的纸牌"+right);
        int var=0;
        left =right;
        right = left;
        System.out.println("互换后小明左手中的纸牌：");
        System.out.println("右手手中的纸牌"+left);
        System.out.println("左手手中的纸牌"+right);
*/

    }
}
