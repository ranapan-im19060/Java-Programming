package com.company;

public class Counter {

    private int value = 0;

    public void increment(){
        value =value + 1;
        System.out.println(value);
    }

    public int getValue(){
        return  value;
    }

}
