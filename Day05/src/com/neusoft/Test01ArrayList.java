package com.neusoft;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author shihaobo
 * @date 2020/5/10 19:37
 */
public class Test01ArrayList {
    public static void main(String[] args) {
        //生成10个1-33之间的随机整数，添加到集合中，并且遍历输出

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Random random = new Random();
            int i1 = random.nextInt(34);
            list.add(i1);
        }
/*        for (int i = 0; i <list.size() ; i++) {
            Integer integer = list.get(i);
            System.out.print(integer+"\t");
        }*/

        printArrayList(list);
    }


    //自定义方法打印list
        public static void printArrayList(ArrayList<Integer> list){
            // 拼接左括号
            System.out.print("[");
            // 遍历集合
            for (int i = 0; i < list.size(); i++) {
                // 获取元素
                Integer num = list.get(i);
                System.out.print(num +",");

            }
            // 拼接右括号
            System.out.println("]");
        }
}
