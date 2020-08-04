package com.neusoft.zuoye.qingsong3;

/**
 * @author shihaobo
 * @date 2020/8/3 19:52
 */
public class nongye implements yinlian {
    private double money;
    private String id;
    private String name;
    @Override
    public void quMoney(double money1) {
        if (money1-money<0){
            money =money - money1;
            System.out.println("已取出"+money1+"元，现有余额为"+money+"元");
        }else {
            System.out.println("余额不足");
        }
    }

    public nongye(double money, String id, String name) {
        this.money = money;
        this.id = id;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void cun(double year){
        double lirun = money*0.03*year;
        double m1 = money+lirun;
        System.out.println(year+"年后的利润为"+lirun+"元，余额为"+m1+"元");
    }
    // 存钱年份year，存钱金额money2，利润lirun
    public void cun(double year,double money2){
        double lirun = (money2+money)*0.03*year;
        double m2 = lirun+money2+money;
        System.out.println(year+"年后的利润为"+lirun+"元，余额为"+m2+"元");
    }
}
