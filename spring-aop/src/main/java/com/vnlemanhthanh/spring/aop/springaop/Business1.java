/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.aop.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething() {
        //Business logic

        return dao1.retrieveSomething();
    }
}
