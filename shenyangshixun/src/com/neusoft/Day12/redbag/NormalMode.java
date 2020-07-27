package com.neusoft.Day12.redbag;

import com.neusoft.Day12.redbag.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/7/27 9:21
 */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoey, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        // 100/3
        int avg = totalMoey / totalCount;
        int mod = totalMoey % totalCount;   //零头
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        // 零头放在最后一个包里面；
        list.add(avg+mod);
        return list;
    }

}
