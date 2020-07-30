package com.neusoft.Day15.exceptionDemo;

/**
 * @author shihaobo
 * @date 2020/7/30 11:24
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int index = 4;
        int element = getElement(arr, index);
        System.out.println(element);
    }
    public static int getElement(int[] arr, int index){
        // 判断
        if (index < 0 || index> arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组越界了，兄弟");
        }
        return arr[index];
    }
}
