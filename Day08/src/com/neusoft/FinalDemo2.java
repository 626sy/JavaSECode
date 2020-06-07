package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/6/7 20:56
 */
public class FinalDemo2 {
    public static void main(String[] args) {
        // 引用类型的局部变量,被final修饰,只能指向一个对象,地址值是不能改变的.
        // 但是不影响对象内部成员变量值的修改

        final User user1 = new User();  //user1的地址值不能改变
        System.out.println(user1.getName());

//        user1 = new user();
//        User user2 = new User();

        user1.setName("李四");
        System.out.println(user1.getName());
    }
}
