package com.example.sell;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * ClassName: webTest
 * Description:
 * date: 2020/4/5 18:36
 *
 * @author YWA
 * @version 1.0
 * @since JDK 1.8
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class webTest {

    @Test
    public void test(){
        log.debug("debug...");
        log.info("info...");
        log.error("error...");

    }
}
