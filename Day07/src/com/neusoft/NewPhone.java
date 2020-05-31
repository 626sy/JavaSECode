package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/31 15:11
 */
public class NewPhone extends Phone{

    //重写父类的来电显示功能，并且增加自动显示姓名和图片功能
    @Override
    public void shownum(){
        //调用父类已经存在的功能，使用super
        super.shownum();
        System.out.println("显示来电姓名");
        System.out.println("显示来电头像");
    }
}
