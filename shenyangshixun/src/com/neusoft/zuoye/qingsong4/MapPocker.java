package com.neusoft.zuoye.qingsong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author shihaobo
 * @date 2020/8/5 8:18
 */
public class MapPocker {
    public static void main(String args[]){
        HashMap<Integer, String> pockermap = new HashMap<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♠","♣");
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
    }

}
