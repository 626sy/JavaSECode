package com.neusoft.zuoye.qingsong1;

/**
 * @author shihaobo
 * @date 2020/7/30 18:56
 */
public class Phone {
    private String name;
    private String pinpai;

    public Phone() {
    }

    public Phone(String name, String pinpai) {
        this.name = name;
        this.pinpai = pinpai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", pinpai='" + pinpai + '\'' +
                '}';
    }
}
