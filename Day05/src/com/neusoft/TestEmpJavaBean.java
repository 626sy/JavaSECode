package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/5/10 15:07
 */
public class TestEmpJavaBean {
    public static void main(String[] args) {
        //有参的构造方法的调用
        EmpJavaBean e = new EmpJavaBean("石浩博", 10086, "java架构师", 20000);
        System.out.println(e.getName()+"---"+e.getPosition()+"---"+e.getJobnumber()+"---"+e.getSalary());

        //无参的构造方法的调用
        EmpJavaBean e2 = new EmpJavaBean();
        e2.setName("王青松");
        e2.setJobnumber(10085);
        e2.setPosition("Java工程师");
        e2.setSalary(40000);
        System.out.println(e2.getName()+"---"+e2.getPosition()+"---"+e2.getJobnumber()+"---"+e2.getSalary());

    }
}
