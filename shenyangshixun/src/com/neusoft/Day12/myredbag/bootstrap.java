package com.neusoft.Day12.myredbag;

/**
 * @author shihaobo
 * @date 2020/7/27 11:21
 */
public class bootstrap {
    public static void main(String[] args) {
        //设置标题
        MyRed myRed = new MyRed("阿里巴巴");
        // 设置群主名
        myRed.setOwnerName("马云");
        //设置分发策略
        NormalMode normalMode = new NormalMode();
        myRed.setOpenWay(normalMode);
        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);
    }
}
