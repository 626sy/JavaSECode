package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:43
 * 5. 输入某年某月某日，判断这一天是这一年的第几天？
 *    分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */
public class TianSu {
    public static void main(String[] args) {
        int yy=2017;
        int mm=3;
        int dd=27;

        switch(mm-1) //用之前各个月的天数，加上本月的天数
        {
            case 11:
                dd=dd+30;
            case 10:
                dd=dd+31;
            case 9:
                dd=dd+30;
            case 8:
                dd=dd+31;
            case 7:
                dd=dd+31;
            case 6:
                dd=dd+30;
            case 5:
                dd=dd+31;
            case 4:
                dd=dd+30;
            case 3:
                dd=dd+31;
            case 2:
                dd=dd+28;
            case 1:
                dd=dd+31;
        }

        if(yy%4==0&&yy%100!=0||yy%400==0)
        {
            dd=dd+1; //如果是闰年再加1天
        }

        System.out.println("是"+yy+"的第"+dd+"天");
    }
}
