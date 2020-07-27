package com.neusoft.Day12.AlwaysAPI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/7/27 15:57
 */
public class TestDate2  {
    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
//        System.out.println(simpleDateFormat);
        String str = df.format(date);
        System.out.println(df);
        System.out.println(str);
//        String str ="2010年1月1日";


    }
}
