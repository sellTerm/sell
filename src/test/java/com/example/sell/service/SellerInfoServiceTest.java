package com.example.sell.service;

import com.example.sell.domain.SellerInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import static org.assertj.core.util.DateUtil.now;

/**
 * ClassName: SellerInfoServiceTest
 * Description:
 * date: 2020/4/5 23:02
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoServiceTest {
    @Autowired
    private SellerInfoService sellerInfoService;
    @Test
    public void test() {
        SellerInfo sellerInfo = sellerInfoService.findById();
        System.out.println(sellerInfo.toString());
    }

    @Test
    public void test1() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setId("2");
        sellerInfo.setUsername("2");
        sellerInfo.setPassword("2");
        sellerInfo.setOpenid("2");
        sellerInfo.setCreateTime(now());
        sellerInfo.setUpdateTime(now());
        sellerInfoService.save(sellerInfo);
    }

}
