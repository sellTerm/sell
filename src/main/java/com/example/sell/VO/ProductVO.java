package com.example.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * ClassName: ProductVO
 * Description:返回商品列表类
 * date: 2020/4/6 14:33
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;//商品名称

    @JsonProperty("type")
    private Integer categoryType;//商品类型

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
