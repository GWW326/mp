package com.govin.mp;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.govin.mp.user.mapper")
class MpApplicationTests {
    public static Logger logger = LoggerFactory.getLogger(MpApplicationTests.class);
	@Test
	void contextLoads() {
	}
	@Test
    void print(){
        logger.info("{}--{}","test","info");
        logger.info("msg--info");
        logger.debug("{}--{}","test","debug");
        System.out.println("1111");
    }
}
