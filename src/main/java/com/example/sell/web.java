package com.example.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: web
 * Description:
 * date: 2020/4/5 13:13
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/user")
public class web {

    @RequestMapping("/helloworld")
        public Map<String, Object> test(){
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            hashMap.put("msg","helloworld...");
            return hashMap;
         }

}
