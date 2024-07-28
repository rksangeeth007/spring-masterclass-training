package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MyMathTest {

    MyMath mymath = new MyMath();

    @Test
    public void sumTestWith3Numbers() {
        assertEquals(6, mymath.sum(new int[] {1,2,3}));
    }

    @Test
    public void sumTestWith1Number() {
        assertEquals(3, mymath.sum(new int[] {3}));
    }
}
