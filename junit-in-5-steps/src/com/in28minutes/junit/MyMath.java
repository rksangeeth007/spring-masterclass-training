package com.in28minutes.junit;

public class MyMath {

    public int sum( int[] number){
         int res = 0;
        for( int i : number){
            res += i;
        }
        return res;
    }
}
