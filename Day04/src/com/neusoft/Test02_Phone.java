package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/4/26 19:16
 */
public class Test02_Phone {
    public static void main(String[] args) {
        //创建对象
        Phone phone = new Phone();

/*        //输出成员变量
        System.out.println("品牌："+ phone.pinpai);
        System.out.println("价格："+ phone.price);
        System.out.println("颜色："+ phone.color);
        System.out.println("---------------------");*/

        //赋值
        phone.pinpai = "华为";
        phone.price = 5999;
        phone.color = "蓝色";
        show(phone);

/*        //再次输出
        System.out.println("品牌"+ phone.pinpai);
        System.out.println("价格"+ phone.price);
        System.out.println("颜色"+ phone.color);
        System.out.println("----------------------");*/


/*        //调用方法
        phone.Called("青松");
        phone.Email();*/

    }
    //对象作为参数进行传递
    public static void show(Phone phone){
        System.out.println(phone.pinpai +"  "+ phone.price+"     "+ phone.color);
    }

}
