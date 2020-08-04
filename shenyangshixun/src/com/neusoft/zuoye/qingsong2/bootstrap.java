package com.neusoft.zuoye.qingsong2;

/**
 * @author shihaobo
 * @date 2020/7/31 19:11
 */
public class bootstrap {
    public static void main(String[] args) {
        //设置标题
        MyRed myRed = new MyRed("红包雨");
        // 设置群主
        myRed.setOwnerName("马云");
        // 设置红包方式
        NormalMode1 normalMode1 = new NormalMode1();
        myRed.setOpenWay(normalMode1);
        RandomMode1 randomMode1 = new RandomMode1();
        myRed.setOpenWay(randomMode1);
    }
}
