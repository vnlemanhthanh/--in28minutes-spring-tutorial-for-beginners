/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//Configuration
@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "execution(* com.vnlemanhthanh.spring.aop.springaop.business.*.*(..))",
            returning = "result")
    public void afterRetuning(JoinPoint joinPoint, Object result) {
        logger.info("{} return with {}", joinPoint, result);
    }

    @After(value = "execution(* com.vnlemanhthanh.spring.aop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }

}
