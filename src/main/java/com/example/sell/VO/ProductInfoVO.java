package com.example.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: ProductInfoVO
 * Description:商品列表中商品详情
 * date: 2020/4/6 14:38
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@Data
public class ProductInfoVO {
    //商品id
    @JsonProperty("id")
    private String productId;

    //商品名称
    @JsonProperty("name")
    private String productName;

    //单价
    @JsonProperty("price")
    private BigDecimal productPrice;

    //描述
    @JsonProperty("description")
    private String productDescription;

    //小图片
    @JsonProperty("icon")
    private String productIcon;
}
