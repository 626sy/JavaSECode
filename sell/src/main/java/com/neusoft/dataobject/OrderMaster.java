package com.neusoft.dataobject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author shihaobo
 * @date 2020/6/22 19:05
 * dataobject 中的类即是实体类
 * 他是与数据库中的表字段一一对应的类
 * 写成JavaBean模式
 */
@Entity
@Data
public class OrderMaster {
    /*订单id  主键*/
    @Id
    private String orderId;

    /*买家名字*/
    private String buyerName;

    /*订单的总金额*/
    private BigDecimal orderAmount;

    //买家电话
    private  String buyerPhone;

    //买家地址
    private  String buyerAddress;

    //订单状态

    //创建时间

    //修改时间



}
