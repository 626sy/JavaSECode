package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/19 19:35
 * 随机种子seed
 * 作用时重新设置random对象的种子数
 * 设置完种子数以后的random对象和相同的种子数
 * new 创建出来的对象相同
 */

public class ForForDemo07 {
    public static void main(String[] args) {
        //带有标识的break和continue
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if (j== 3)
                    break;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
