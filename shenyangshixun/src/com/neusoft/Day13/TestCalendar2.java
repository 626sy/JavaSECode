package com.neusoft.Day13;

import java.util.Calendar;

/**
 * @author shihaobo
 * @date 2020/7/28 8:57
 */
public class TestCalendar2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int mouth = calendar.get(Calendar.MONTH)+1;
        int dayofMouth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+mouth+"月"+dayofMouth+"日");
        calendar.set(Calendar.YEAR,1998);
        calendar.set(1999,02,20);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(year+"年"+mouth+"月"+dayofMouth+"日");

    }
}
