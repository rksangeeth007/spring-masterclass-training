package com.in28minutes.mockitodemo;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class ListTest {

    @Test
    public void testSize(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
    }

    @Test
    public void testSize_MultipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20).thenReturn(30);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(30, listMock.size());
    }

    @Test
    public void testGet_specificparam(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGet_genericparam(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals("SomeString", listMock.get(1));
    }
}
