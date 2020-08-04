package com.neusoft.zuoye.qingsong3;

/**
 * @author shihaobo
 * @date 2020/8/3 19:52
 */
public class gongshang implements yinlian{
    private double money;
    private String id;
    private String name;
    private double jiekuan;


    @Override
    public void quMoney(double money1) {
        if (money1-money<50000){
            money = money -money1;
            System.out.println("已取出"+money1+"元，余额为"+money+"元");
        }else {
            System.out.println("余额不足");
        }
    }

    // 定义构造方法

    public gongshang(double money,String id,String name) {
        this.money = money;
        this.id = id;
        this.name = name;
    }
    // 定义getset方法

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

    // 定义借款方法
    public void jie(double money1){
        if (money1 - money<50005&& money1<30000){
            money=money-money1;
            jiekuan = jiekuan+money1;
            System.out.println("本次已成功借款"+money1+"元");
        }else {
            System.out.println("借款失败，请降低借款额");
        }
    }
    // 定义催款方法(计算多久借款利息到达最低限额),jiekuan表示总的借款
    public void time(){
        double year = (money+50000)%(jiekuan*0.05);
        System.out.println("您现有借款"+jiekuan+"元，账号将于"+year+"年后到达限额");
    }
}
