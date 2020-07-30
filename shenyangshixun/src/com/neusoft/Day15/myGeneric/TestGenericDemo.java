package com.neusoft.Day15.myGeneric;

/**
 * @author shihaobo
 * @date 2020/7/30 9:09
 */
public class TestGenericDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String类
        MyGenericClass<String> my = new MyGenericClass<>();
        my.setMvp("哈登");
        my.setMvp("刘翔");
        String mvp = my.getMvp();
        System.out.println(mvp);

        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(13);
        Integer mvp2 = my2.getMvp();
        System.out.println(mvp2);

        MyGenericClass<String> my3 = new MyGenericClass<>();
        my3.setMvp("王青松");

        String mvp3 = my3.getMvp();
        System.out.println(mvp3);
    }
}
