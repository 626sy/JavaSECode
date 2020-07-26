package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:40
 *
2. 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
public class TianQiu {
    public static void main(String[] args) {
        double h1=100;//第1次开始下落的高度
        double high = h1/2;//第1次反弹的高度
        double sum=0;

        for(int i=1; i<=10; i++)
        {
            //从第1次反弹开始，到第10次落地，共10次反复
            //后一次是前一次高度的一半
            sum = high*2+sum;
            high = high/2;
        }

        //共经过的距离要加上开始下落的100米
        System.out.println("第10次落地共经过："+(sum+100)+"米");

        //第10次弹起的高度是第11次的一倍
        System.out.println("第10次弹起："+(high*2)+"米");
    }
}
