package com.in28minutes.junit;

import org.junit.*;

import static org.junit.Assert.*;
import com.in28minutes.junit.MyMath;
public class AssertTest {

    MyMath mymath = new MyMath();

    @Test
    public void test(){
        assertEquals(true,true);
        assertTrue(true);
      //  assertFalse(true);
        assertArrayEquals(new int[] {1,2,3} , new int[] {1,2,3});
    }

    @Test
    public void sumTestWith3Numbers() {
        System.out.println("Test1");
        assertEquals(6, mymath.sum(new int[] {1,2,3}));
    }

    @Test
    public void sumTestWith1Number() {
        System.out.println("Test2");
        assertEquals(3, mymath.sum(new int[] {3}));
    }

    @Before
    public void beforeMethod(){
        System.out.println("Before");
    }

    @After
    public void afterMethod(){
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClassMethod(){
        System.out.println("After Class");
    }
}
