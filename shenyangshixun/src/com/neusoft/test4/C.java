package com.neusoft.test4;

/**
 * @author shihaobo
 * @date 2020/7/23 14:31
 */
public class C extends B {
    int numc = 30;

    @Override
    public void showB() {
        System.out.println("B类中numa:"+numb);
    }

    @Override
    public void showA() {
        System.out.println("A类中numa:"+numa);
    }
    public void showC(){
        System.out.println("C类中numa:"+numc);
    }
}
