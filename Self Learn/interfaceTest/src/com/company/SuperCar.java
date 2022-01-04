package com.company;

public class SuperCar implements ICar{
    String name = "Ferrari";

    @Override
    public void turnOnCar() {
        System.out.println(name + " is started.......");
    }

    @Override
    public void turnOffCar() {
        System.out.println(name + " is stopped.......");
    }

    @Override
    public String getCarType() {
        return this.name;
    }
}
