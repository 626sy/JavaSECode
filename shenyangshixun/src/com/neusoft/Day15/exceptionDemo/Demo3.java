package com.neusoft.Day15.exceptionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/7/30 14:09
 */
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String s = "1994-12";
        timeFormat(s);

    }
    public static void timeFormat(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
