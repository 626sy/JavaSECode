package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/19 16:30
 * 打印1天内 所有的时间格式
 * 格式是12时43分
 */

public class ForForDemo04 {
    public static void main(String[] args) {
        for (int i = 0; i <=23; i++) {
            for (int j = 0; j <=60 ; j++) {
                System.out.print(i + "时" + j + "分\t");
            }
            System.out.println();
        }
    }

}
