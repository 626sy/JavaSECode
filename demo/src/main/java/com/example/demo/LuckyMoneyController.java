package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class LuckyMoneyController {

    //导入编写好的jpa文件
    @Autowired
    private LuckyMoneyRepository luckyMoneyRepository;

    //获取红包列表
    @RequestMapping("/luckymoneylist")
    public List<LuckyMoney> list(){
        return luckyMoneyRepository.findAll();
    }

    //发红包
    //创建红包的过程
    @PostMapping("/create")
    public LuckyMoney create(@RequestParam("producer") String producer
            ,@RequestParam("money") BigDecimal money){
        LuckyMoney luckyMoney = new LuckyMoney();
        luckyMoney.setProducer(producer);
        luckyMoney.setMoney(money);

        return luckyMoneyRepository.save(luckyMoney);

    }


}
