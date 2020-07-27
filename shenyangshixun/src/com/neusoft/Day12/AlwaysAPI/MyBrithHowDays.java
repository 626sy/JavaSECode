package com.neusoft.Day12.AlwaysAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/7/27 16:31
 */
public class MyBrithHowDays {
    public static void main(String[] args) throws ParseException {
        function();
    }
    public static void function() throws ParseException {
        System.out.println("请输入出生日期 格式yyyy-MM-dd");

        String  birthdayString = new Scanner(System.in).next();
        Date currentDate = new Date();
        // 将birthdayString转化为Date对象
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = df.parse(birthdayString);

        // 1.获取当前时间对应的毫秒值
        long currentDateTime = currentDate.getTime();
        // 2.获取出生日期对应的毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        // 3.相减
        long resultDateTime = currentDateTime-birthdayDateTime;
        if (resultDateTime < 0){
            System.out.println("鳖孙");
        }else {
            System.out.println(resultDateTime/1000/60/60/24);
        }

    }
}
