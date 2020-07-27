package com.neusoft.Day12.myredbag;

import com.neusoft.Day12.myredbag.utils.OpenWay;

import java.util.ArrayList;


/**
 * @author shihaobo
 * @date 2020/7/27 11:30
 */
public class NormalMode implements OpenWay {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalCount;
        int mod = totalMoney%totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(mod+avg);

        return list;
    }
}
