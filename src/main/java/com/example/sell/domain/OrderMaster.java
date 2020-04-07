package com.example.sell.domain;

import com.example.sell.domain.enums.OrderStatusEnum;
import com.example.sell.domain.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class OrderMaster {
    //订单Id 主键
    private String orderId;

    //买家姓名
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信openID
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    //支付状态
    private Integer payStatus = PayStatusEnum.WAITING.getCode();

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;

}