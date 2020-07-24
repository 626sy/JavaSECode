package com.neusoft.test3;

/**
 * @author shihaobo
 * @date 2020/7/23 19:03
 */
public class User {
    //用户名
    private String userName;
    // 余额
    private int leftMoney;

    public User(){

    }

    public User(String username, int leftMoney) {
        this.userName = username;
        this.leftMoney = leftMoney;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public int getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(int leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println("用户" + userName + "\t"+"余额为" + leftMoney + "元" );

    }
}
