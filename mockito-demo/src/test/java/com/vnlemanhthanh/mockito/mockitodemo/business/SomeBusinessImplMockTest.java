/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockTest {

    @Test
    void findTheGreatestFromAllData() {
        DataService dataServiceMock = mock(DataService.class);

        //dataServiceMock.retrieveAllData() => new int[] {25,15,5}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,15,5});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
        assertNotEquals(15, result);
    }

}
