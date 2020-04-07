package com.example.sell.service;

import com.example.sell.domain.ProductInfo;
import com.example.sell.domain.SellerInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: ProductInfoInterService
 * Description:
 * date: 2020/4/5 22:26
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
public interface ProductInfoService {

    //根据id查询
    ProductInfo findById(String productId);

    //增加商品
    void save(ProductInfo productInfo);

    //查询所有
     List<ProductInfo> findAll();
}
