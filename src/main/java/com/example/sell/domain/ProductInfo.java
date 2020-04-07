package com.example.sell.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductInfo {
    //商品id
    private String productId;
    //商品名称
    private String productName;
    //单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;
    //小图片
    private String productIcon;
    //商品状态 0：正常 1 下架
    private Byte productStatus;
    //商品分类
    private Integer categoryType;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
}