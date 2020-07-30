package com.neusoft.Day15.myGeneric;

/**
 * @author shihaobo
 * @date 2020/7/30 9:21
 */
public class TestGenericDemo1 {
    public static void main(String[] args) {
        MyGenericMethod mgm = new MyGenericMethod();
        // 在调用反法的时候，就确定了泛型的类型
        mgm.show("aaa");
        mgm.show(123);
        mgm.show(12.45);

    }
}
