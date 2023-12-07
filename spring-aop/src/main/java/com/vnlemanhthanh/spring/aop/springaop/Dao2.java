/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.aop.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveSomething() {
        return "Dao2";
    }
}
