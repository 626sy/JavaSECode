package com.neusoft.Day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/7/28 9:12
 */
public class TestCalendar4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
        Date date1 = new Date();
        System.out.println(date1);

    }
}
