package com.neusoft.zuoye.qingsong4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author shihaobo
 * @date 2020/8/4 20:02
 */
public class Pocker {
    public static void main(String[] args) {
        // 卡盒
        ArrayList<String> pockerBox = new ArrayList<>();
        // 数字
        ArrayList<String> numbers = new ArrayList<>();
        // 花色
        ArrayList<String> colors = new ArrayList<>();
        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");
        //添加数字
        for (int i = 2; i <= 10; i++) {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        // 生成牌
        for(String color:colors){
            for (String number:numbers){
                String card = color+number;
                pockerBox.add(card);
            }
        }
        pockerBox.add("大王");
        pockerBox.add("小王");
//        System.out.println(pockerBox);
        // 洗牌，使用collections
        // shuffle（）
        Collections.shuffle(pockerBox);
//        System.out.println(pockerBox);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pockerBox.size(); i++) {
            String card = pockerBox.get(i);
            if (i>=51){
                dipai.add(card);
            }else {
                if (i%3==0){
                    player1.add(card);
                }else if (i%3 ==1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }

        System.out.println("A的牌"+player1);
        System.out.println("B的牌"+player2);
        System.out.println("C的牌"+player3);
        System.out.println("底牌"+dipai);
    }
}
