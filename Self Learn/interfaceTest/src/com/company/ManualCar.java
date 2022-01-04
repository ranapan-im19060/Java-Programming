package com.company;

public class ManualCar implements ICar {
    private String carType = "Manual";

    @Override
    public void turnOnCar() {
        System.out.println("Manual car is started.....");
    }

    @Override
    public void turnOffCar() {
        System.out.println("Manual car is stopped.....");
    }

    @Override
    public String getCarType() {
        return this.carType;
    }
}
