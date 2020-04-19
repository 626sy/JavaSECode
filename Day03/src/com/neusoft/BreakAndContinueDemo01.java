package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/19 15:43
 */
//break跳出本层循环
    //continue用来结束本次循环，进行下一次循环
public class BreakAndContinueDemo01 {
    public static void main(String[] args) {

        System.out.println("start");
        //定义10次循环
        for (int i = 1; i <= 10; i++){
            //判断 i= 6 结束循环
            if (i == 6)
                break;
            System.out.println("hello world "+ i);
        }
        System.out.println("end");


    }
}
