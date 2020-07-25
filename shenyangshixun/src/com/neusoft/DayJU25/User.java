package com.neusoft.DayJU25;

/**
 * @author shihaobo
 * @date 2020/7/25 9:17
 */
public class User {
    // 构造方法初始化
    final String USERNAME ;

    private int age;


    public User(String username, int age) {
        USERNAME = username;
        this.age = age;
    }

    public User(String username) {

        USERNAME = username;
    }
}
