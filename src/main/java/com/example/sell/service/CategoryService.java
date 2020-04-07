package com.example.sell.service;

import com.example.sell.domain.ProductCategory;
import com.example.sell.domain.ProductInfo;

import java.util.List;

/**
 * ClassName: CategoryService
 * Description:
 * date: 2020/4/5 22:26
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
public interface CategoryService {

    //根据id查询
    ProductInfo findById(String categoryId);

    //增加商品类目
    void save(ProductCategory productCategory);

    //查询所有
     List<ProductCategory> findAll();

    //根据类目名称查询所有
    List<ProductCategory> findByCategoryType(List<Integer> categoryTypeLsit);
}
