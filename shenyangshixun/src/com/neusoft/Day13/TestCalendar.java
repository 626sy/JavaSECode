package com.neusoft.Day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/7/28 8:41
 */
public class TestCalendar {
    public static void main(String[] args) {
        // 创建calendar对象
        Calendar calendar = Calendar.getInstance();
//        Date date = new Date();
//        System.out.println(date);
        System.out.println(calendar);
        // 设置年
        int year = calendar.get(Calendar.YEAR);
        // 设置月
        int mouth = calendar.get(Calendar.MONTH)+1;
        // 设置日
        int dayofMouth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+"年"+mouth+"月"+dayofMouth+"日");
    }
}

