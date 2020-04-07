package com.example.sell.service.impl;

import com.example.sell.domain.ProductInfo;
import com.example.sell.domain.ProductInfoExample;
import com.example.sell.domain.SellerInfo;
import com.example.sell.mapper.ProductInfoMapper;
import com.example.sell.mapper.SellerInfoMapper;
import com.example.sell.service.ProductInfoService;
import com.example.sell.service.SellerInfoService;
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
public class ProductInfoServiceImpl implements ProductInfoService{


    @Autowired
    private ProductInfoMapper productInfoMapper;


    //查询所有上架商品
    @Override
    public List<ProductInfo> findAll() {
        ProductInfoExample example = new ProductInfoExample();
        ProductInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProductStatusEqualTo((byte) 0);
        return  productInfoMapper.selectByExample(example);
    }

    @Override
    public ProductInfo findById(String productId ){
        return productInfoMapper.selectByPrimaryKey(productId);
    }

    @Override
    public void save(ProductInfo productInfo) {

    }
}
