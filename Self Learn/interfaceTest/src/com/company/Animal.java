package com.company;

public class Animal {

    private String name;
    private int numLegs;

    public Animal(String name, int numLegs) {
        this.name = name;
        this.numLegs = numLegs;
    }

    public void talk(){
        System.out.println("animal is talking........");
    }
}
