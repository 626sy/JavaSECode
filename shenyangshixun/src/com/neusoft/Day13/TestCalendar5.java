package com.neusoft.Day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/7/28 9:23
 */
public class TestCalendar5 {
    public static void main(String[] args) throws ParseException {
        // calendar.getActualMaxmum：获取给定日历的最大可能值
        // 编写一个方法，根据给定字符串yyyy-MM获取当月的最后一天

        String lastDayOfMonth = getLastDayOfMonth("2020-02");
        System.out.println(lastDayOfMonth);
        int lastDay = LastDay(1999,9);
        System.out.println(lastDay);
    }

    public static String getLastDayOfMonth(String yearmonth) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(yearmonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return ""+ lastDay;
    }

    public static int LastDay(int year,int month ){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();   //清除所有日期数据
        calendar.set(Calendar.YEAR,year);
        if (month<13){
            calendar.set(Calendar.MONTH,month -1);
        }

        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return lastDay;
    }
}
