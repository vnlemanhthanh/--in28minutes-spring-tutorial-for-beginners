/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SomeBusinessImplTest {

    @Test
    void findTheGreatestFromAllData() {
        DataServiceStub1 dataServiceStub = new DataServiceStub1();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);
        int result = business.findTheGreatestFromAllData();
        assertEquals(25, result);
        assertNotEquals(1, result);
    }
}

class DataServiceStub1 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {25,15,5};
    }
}

class DataServiceStub2 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {1,2,3};
    }
}