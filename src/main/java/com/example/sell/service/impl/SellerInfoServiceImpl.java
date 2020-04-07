package com.example.sell.service.impl;

import com.example.sell.domain.SellerInfo;
import com.example.sell.mapper.SellerInfoMapper;
import com.example.sell.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: sellerInfoServiceImpl
 * Description:
 * date: 2020/4/5 22:27
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class SellerInfoServiceImpl implements SellerInfoService {
    @Autowired
    private SellerInfoMapper sellerInfoMapper;

    @Override
    public void save(SellerInfo sellerInfo) {
        sellerInfoMapper.insert(sellerInfo);
    }

    @Override
    public SellerInfo findById() {
        return sellerInfoMapper.selectByPrimaryKey("2");
    }
}
