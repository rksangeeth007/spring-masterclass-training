package com.in28minutes.mockitodemo;

public class SomeBusinessImpl {

    private final DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int greatest_num(){
        int[] num_list = dataService.retrieve_nums();
        int greatest = Integer.MIN_VALUE;
        for(int value: num_list){
            if(value > greatest)
            {
                greatest = value;
            }
        }
        return greatest;
    }
}