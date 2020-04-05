package com.example.sell.domain;

import lombok.Data;

import java.util.Date;

@Data
public class SellerInfo {
    private String id;

    private String username;

    private String password;

    private String openid;//微信openid

    private Date createTime;//创建时间

    private Date updateTime;//修改时间

}