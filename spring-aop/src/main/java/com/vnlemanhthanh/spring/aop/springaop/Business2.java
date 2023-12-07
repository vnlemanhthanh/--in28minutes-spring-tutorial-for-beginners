/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.aop.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething() {
        //Business logic

        return dao2.retrieveSomething();
    }
}
