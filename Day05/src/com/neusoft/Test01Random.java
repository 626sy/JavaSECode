package com.neusoft;

import java.util.Random;

/**
 * @author shihaobo
 * @date 2020/5/10 16:58
 *
 */
public class Test01Random {
    public static void main(String[] args) {
        // Random 类用于生成伪随机数
        Random random = new Random();
        int i = random.nextInt(100);
        //bound后的数：左闭右开
        System.out.println(i);

    }
}
