package com.example.sell.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderDetail {
    //主键ID
    private String detailId;

    //订单ID
    private String orderId;

    //商品ID
    private String productId;

    //商品名称
    private String productName;

    //商品价格
    private BigDecimal productPrice;

    //商品数量
    private Integer productQuantity;

    //商品图片
    private String productIcon;

    //创建日期
    private Date createTime;

    //修改日期
    private Date updateTime;
}