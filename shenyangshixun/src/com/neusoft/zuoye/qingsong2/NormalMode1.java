package com.neusoft.zuoye.qingsong2;

import com.neusoft.zuoye.qingsong2.utils.HongbaoMode;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/7/31 18:59
 */
public class NormalMode1 implements HongbaoMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalcount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/totalcount;
        int mod = totalMoney%totalcount;
        for (int i = 0; i < totalcount - 1; i++) {
            list.add(avg);
        }
        list.add(avg+mod);
        return list;
    }

}
