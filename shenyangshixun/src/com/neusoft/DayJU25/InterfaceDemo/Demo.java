package com.neusoft.DayJU25.InterfaceDemo;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/7/25 14:37
 */
public class Demo {
    public static void main(String[] args) {


    }

    public static void getDoubleNum(ArrayList<Integer> list){
        ArrayList<Integer> doubleList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 == 0) {
                doubleList.add(list.get(i));
            }

        }

    }
}
