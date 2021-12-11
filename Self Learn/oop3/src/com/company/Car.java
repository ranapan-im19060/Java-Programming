package com.company;

public class Car extends Vehicle{
    private int doors;
    private int enginecapacity;

    public Car(String name,int doors,int enginecapacity) {
        super(name);
        this.enginecapacity = enginecapacity;
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public int getEnginecapacity() {
        return enginecapacity;
    }
}
