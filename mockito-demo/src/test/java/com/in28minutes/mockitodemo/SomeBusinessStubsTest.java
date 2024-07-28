package com.in28minutes.mockitodemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
//import org.springframework.boot.test.context.SpringBootTest;

public class SomeBusinessStubsTest {

    SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStubs());

    @Test
    void testgreatest_num() {
        int result = someBusiness.greatest_num();
        Assert.assertEquals(24, result);
    }
}


class DataServiceStubs implements DataService{

    @Override
    public int[] retrieve_nums(){
        return (new int[] {24,5,13});
    }
}