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
    public ArrayList<Integer> divide(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = count;
        for (int i = 0; i < totalMoney - 1; i++) {
            int Money = 1+ random.nextInt(leftMoney/leftCount*2);
            list.add(Money);
            leftCount--;
            leftMoney-=Money;
        }
        list.add(leftMoney);
        return list;
    }
}
