package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:42
 * 4. 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 *   分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
 */
public class PingFangSu {
    public static void main(String[] args) {
        for(int i=100000; i>0; i--)
        {
            //使用Math.sqrt开平方
            //%1==0判断是否为整数
            if(Math.sqrt(i+100)%1==0)
            {
                if(Math.sqrt(i+100+168)%1==0)
                {
                    System.out.println(i+"是完全平方数");
                }
            }
        }
    }
}
