package com.vnlemanhthanh.spring.aop.springaop;

import com.vnlemanhthanh.spring.aop.springaop.business.Business1;
import com.vnlemanhthanh.spring.aop.springaop.business.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Business1 business1;

    @Autowired
    Business2 business2;

    @Override
    public void run(String... args) throws Exception {
        logger.info(business1.calculateSomething());
        logger.info(business2.calculateSomething());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }
}
