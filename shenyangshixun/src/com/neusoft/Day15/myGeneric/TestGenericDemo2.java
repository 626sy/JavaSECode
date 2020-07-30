package com.neusoft.Day15.myGeneric;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/7/30 9:38
 */
public class TestGenericDemo2 {
    public static void main(String[] args) {
        MyGenericImpl2<String> impl2 = new MyGenericImpl2<>();
        ArrayList<Object> list = new ArrayList<>();
        list.add("heheheheh");
    }
}
