package com.example.sell.service.impl;

import com.example.sell.domain.ProductCategory;
import com.example.sell.domain.ProductCategoryExample;
import com.example.sell.domain.ProductInfo;
import com.example.sell.domain.ProductInfoExample;
import com.example.sell.mapper.ProductCategoryMapper;
import com.example.sell.mapper.ProductInfoMapper;
import com.example.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: ProductInfoServiceImpl
 * Description:商家商品类
 * date: 2020/4/5 22:27
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private ProductCategoryMapper productCategoryMapper;


    @Override
    public ProductInfo findById(String productId) {
        return null;
    }


    @Override
    public void save(ProductCategory productCategory) {

    }

    @Override
    public List<ProductCategory> findByCategoryType(List<Integer> categoryTypeLsit) {
        ProductCategoryExample example = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryTypeIn(categoryTypeLsit);
        return  productCategoryMapper.selectByExample(example);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryMapper.selectByExample(null);
    }
}
