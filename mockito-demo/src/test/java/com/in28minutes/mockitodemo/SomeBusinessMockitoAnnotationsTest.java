package com.in28minutes.mockitodemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockitoAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testgreatest_num_3() {
        when(dataServiceMock.retrieve_nums()).thenReturn(new int[] {24, 5, 16});
        Assert.assertEquals(24, someBusiness.greatest_num());
    }

    @Test
    public void testgreatest_num_1() {
        when(dataServiceMock.retrieve_nums()).thenReturn(new int[] {24});
        Assert.assertEquals(24, someBusiness.greatest_num());
    }

    @Test
    public void testgreatest_num_null() {
        when(dataServiceMock.retrieve_nums()).thenReturn(new int[] {});
        Assert.assertEquals(Integer.MIN_VALUE, someBusiness.greatest_num());
    }
}
