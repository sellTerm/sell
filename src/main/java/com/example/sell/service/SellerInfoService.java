package com.example.sell.service;

import com.example.sell.domain.SellerInfo;

/**
 * ClassName: SellerInfoInterService
 * Description:
 * date: 2020/4/5 22:26
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
public interface SellerInfoService {

    SellerInfo findById();

    void save(SellerInfo sellerInfo);
}
