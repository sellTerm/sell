package com.example.sell.web;

import com.example.sell.domain.Response;
import com.example.sell.domain.SellerInfo;
import com.example.sell.service.SellerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            Response response = new Response();
            response.setStatus("10102");
            response.setMsg("ok");
            response.setData(sellerinfo);
            return response;
         }

}
