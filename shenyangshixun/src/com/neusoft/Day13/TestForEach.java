package com.neusoft.Day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shihaobo
 * @date 2020/7/28 16:08
 */
public class TestForEach {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8};
        for (int a: arr){
            System.out.println(a);
        }

        Collection<String> list = new ArrayList<>();
        list.add("青松");
        list.add("貂蝉");
        list.add("吕布");
        for(String hero:list){
            System.out.println("英雄有"+ list);
        }

    }
}
