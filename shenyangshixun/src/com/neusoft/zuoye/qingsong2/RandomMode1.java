package com.neusoft.zuoye.qingsong2;

import com.neusoft.zuoye.qingsong2.utils.HongbaoMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author shihaobo
 * @date 2020/7/31 18:59
 */
public class RandomMode1 implements HongbaoMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalcount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalcount;

        for (int i = 0; i < totalcount - 1; i++) {
            int money = 1+random.nextInt(leftMoney / leftCount * 2);
            list.add(money);
            leftCount--;
            leftMoney -= money;
        }
        list.add(leftMoney);
        return list;
    }
}
