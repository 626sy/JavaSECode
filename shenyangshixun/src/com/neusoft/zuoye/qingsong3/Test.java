package com.neusoft.zuoye.qingsong3;

/**
 * @author shihaobo
 * @date 2020/8/4 8:04
 */
public class Test {
    public static void main(String[] args) {
        nongye nongye1 = new nongye(6000, "10086", "张三");
        gongshang gongshang1 = new gongshang(10000, "1008611", "李四");
        gongshang1.jie(5000);
        gongshang1.time();
        gongshang1.quMoney(500);
        System.out.println(gongshang1.getMoney());
        nongye1.cun(3);
        nongye1.cun(2,10000);
        nongye1.quMoney(5000);

    }
}
