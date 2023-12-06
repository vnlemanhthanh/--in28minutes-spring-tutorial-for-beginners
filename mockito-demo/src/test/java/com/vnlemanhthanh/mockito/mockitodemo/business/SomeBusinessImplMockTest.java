/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData() {
        //dataServiceMock.retrieveAllData() => new int[] {25,15,5}
        when(dataService.retrieveAllData()).thenReturn(new int[] {25,15,5});
        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_OneValue() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {35});
        assertEquals(35, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_EmptyArray() {
        when(dataService.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }
}
