package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
//@在Java中表示注解的意思
@RestController
public class HelloController {
//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//    @Value("${max}")
//    private BigDecimal max;
//    @RequestMapping("/min")
//    public String min(){
//        return "最小金额是" +minMoney;
//    }
//
//    @RequestMapping("/max")
//    public String max(){
//        return "最大金额是" +max;
//    }

    //引入别的类
    @Autowired
    private  LimitConfig limitConfig;
    @RequestMapping("/desc")
    public String desc(){
        return "最小金额是" + limitConfig.getMinMoney()+ "最大金额是" +
                limitConfig.getMaxMoney() + "红包描述" + limitConfig.getDescription();
    }



    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello SpringBoot";
    }

    @RequestMapping("/details")
    public String details(){
        return "这是商品详情页";
    }
    //引用红包的描述
    @RequestMapping("/description")
    public String des(){
        return "恭喜发财，大吉大利";
    }

}
