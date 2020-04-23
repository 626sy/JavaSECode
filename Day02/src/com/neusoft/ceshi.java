package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/14 13:11
 */
public class ceshi {
    public static void main(String[] args) {
        int flag = 6;
        int count = 0;
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + "\t");
            if (++count % flag == 0)
                System.out.println();
        }

    }
}

