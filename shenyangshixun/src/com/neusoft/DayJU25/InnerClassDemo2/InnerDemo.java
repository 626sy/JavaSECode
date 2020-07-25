package com.neusoft.DayJU25.InnerClassDemo2;

/**
 * @author shihaobo
 * @date 2020/7/25 11:15
 */
public class InnerDemo  {
    public static void main(String[] args) {
        /**
         * 1.等号右边 定义并创建该接口的子类对象
         * 2.等号左边 是多态，接口类型引用指向子类对象
         */
        FlyAble f = new FlyAble(){
            @Override
            public void fly() {
                System.out.println("我要起飞了");
            }
        };
        // 将匿名内部类作为方法的参数进行传递
        showFly(f);
    }
    // 静态方法
    public static void showFly(FlyAble f){
        f.fly();

    }
}
