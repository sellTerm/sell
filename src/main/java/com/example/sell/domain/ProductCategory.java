package com.example.sell.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ProductCategory {
    private Integer categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}