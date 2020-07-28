package com.neusoft.Day13;

import java.util.Calendar;

/**
 * @author shihaobo
 * @date 2020/7/28 9:07
 */
public class TestCalendar3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int mouth = calendar.get(Calendar.MONTH)+1;
        int dayofMouth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+mouth+"月"+dayofMouth+"日");
        calendar.add(Calendar.DAY_OF_MONTH,2);

        year = calendar.get(Calendar.YEAR);
        mouth = calendar.get(Calendar.MONTH)+1;
        dayofMouth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+mouth+"月"+dayofMouth+"日");
    }
}
