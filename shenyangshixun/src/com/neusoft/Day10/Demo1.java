package com.neusoft.Day10;

/**
 * @author shihaobo
 * @date 2020/7/24 8:47
 */
public class Demo1 {
    public static void main(String[] args) {
//        {1, 2, 3} === >[1#2#3] ,[1, 2, 3]
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr){
        String s = new String("[");
        // 遍历
        for (int i = 0; i < arr.length-1; i++) {
            if (i == arr.length-1){
                s = s.concat(arr[i] + "]");
            }else {
                s = s.concat(arr[i] + "#");
            }
        }
        return s;
    }
}
