package com.neusoft.zuoye.qingsong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author shihaobo
 * @date 2020/8/5 8:18
 */
public class MapPocker {
    public static void main(String args[]){
        HashMap<Integer, String> pockermap = new HashMap<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors,"♥","♦","♠","♣");
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        int count =1;
        pockermap.put(count++,"大王");
        pockermap.put(count++,"小王");
        // 初始和其他牌
        for(String color:colors){
            for(String number:numbers){
                String card = color+number;
                pockermap.put(count++,card);
            }
        }
//        System.out.println(pockermap);
        // 打乱顺序
        Set<Integer> numberSet = pockermap.keySet();
        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.addAll(numberSet);
        Collections.shuffle(numberlist);
        System.out.println(numberlist);

        // 创建 玩家和底牌编号集合
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> dipaiNo = new ArrayList<>();

        // 不发牌，发编号
        for (int i = 0; i < numberlist.size(); i++) {
            Integer no = numberlist.get(i);
            if (i>=51){
                dipaiNo.add(no);
            }else if (i%3 == 0){
                noP1.add(no);
            }else if (i%3 == 1){
                noP2.add(no);
            }else {
                noP3.add(no);
            }
        }
        // 对手中的编号排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNo);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        // 遍历
        for (Integer i : noP1){
            String card = pockermap.get(i);
            player1.add(card);
        }
        for (Integer i : noP2){
            String card = pockermap.get(i);
            player2.add(card);
        }
        for (Integer i : noP3){
            String card = pockermap.get(i);
            player3.add(card);
        }
        for (Integer i : dipaiNo){
            String card = pockermap.get(i);
            dipai.add(card);
        }
        System.out.println("马云1" + player1);
        System.out.println("马云2"+ player2);
        System.out.println("马云3"+ player3);
        System.out.println("底牌"+ dipai);
    }

}
