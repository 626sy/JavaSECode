package com.neusoft.Day12.myredbag;

import com.neusoft.Day12.myredbag.utils.OpenWay;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author shihaobo
 * @date 2020/7/27 11:39
 */
public class RandomMode implements OpenWay {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            int money = 1+random.nextInt(totalMoney/totalCount*2);
            list.add(money);
            leftCount--;
            leftMoney -=money;
        }
        list.add(leftMoney);

        return list;
    }
}
