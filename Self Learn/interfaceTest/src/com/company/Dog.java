package com.company;

public class Dog extends Animal{
    public Dog(String name, int numLegs) {
        super(name, numLegs);
    }

    @Override
    public void talk() {
        System.out.println("Dog is barking.....");
    }
}
