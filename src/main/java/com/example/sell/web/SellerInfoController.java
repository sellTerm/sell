package com.example.sell.web;

import com.example.sell.VO.ResultVO;
import com.example.sell.domain.SellerInfo;
import com.example.sell.service.SellerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: SellerInfoController
 * Description:
 * date: 2020/4/5 13:13
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/sellInfo")
@Slf4j
public class SellerInfoController {

     @Autowired
    private SellerInfoService sellerInfoService;

        @RequestMapping("/findSeller")
        public Object findSeller(){
            log.info("findSerller....");
            SellerInfo sellerinfo = sellerInfoService.findById();
            ResultVO response = new ResultVO();
            response.setStatus(200);
            response.setMsg("ok");
            response.setData(sellerinfo);
            return response;
         }

}
