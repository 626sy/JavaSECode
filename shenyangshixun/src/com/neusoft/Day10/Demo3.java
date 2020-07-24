package com.neusoft.Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author shihaobo
 * @date 2020/7/24 10:08
 */
public class Demo3 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("排序前"+ Arrays.toString(arr));
        Arrays.sort(arr);
        //
        System.out.println("排序后"+ Arrays.toString(arr));

//        Arrays.toString()
    }
}
