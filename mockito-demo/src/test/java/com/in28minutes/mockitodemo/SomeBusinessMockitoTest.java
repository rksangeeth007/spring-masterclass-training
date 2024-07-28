package com.in28minutes.mockitodemo;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockitoTest {

    @Test
    public void testgreatest_num_3() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieve_nums()).thenReturn(new int[] {24, 5, 16});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.greatest_num();
        Assert.assertEquals(24, result);
    }

    @Test
    public void testgreatest_num_1() {
        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieve_nums()).thenReturn(new int[] {24});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        int result = someBusiness.greatest_num();
        Assert.assertEquals(24, result);
    }
}
