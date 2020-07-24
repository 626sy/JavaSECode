package com.neusoft.Day10;

/**
 * @author shihaobo
 * @date 2020/7/24 9:21
 */
public class Array2String {
    public String arrayToString(int[] arr) {
        String s = new String("[");
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s = s.concat(arr[i] + "]");
            } else {
                s = s.concat(arr[i] + "#");
            }
        }
        return s;
    }
}
