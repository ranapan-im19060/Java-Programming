package com.company;

public class Ferrari extends Car{

    private boolean reverseCamera;
    private int numberOfDashCam;

    public Ferrari( int numberOfAirbags, int engineCapacity, String modelName, boolean reverseCamera) {
        super("Ferrari", numberOfAirbags, engineCapacity, modelName, 4);
        this.reverseCamera = reverseCamera;
        this.numberOfDashCam = numberOfDashCam;
    }

    public boolean isReverseCamera() {
        return reverseCamera;
    }

    public void setReverseCamera(boolean reverseCamera) {
        this.reverseCamera = reverseCamera;
    }

    public int getNumberOfDashCam() {
        return numberOfDashCam;
    }

    public void setNumberOfDashCam(int numberOfDashCam) {
        this.numberOfDashCam = numberOfDashCam;
    }

    @Override
    public void engineStart() {
        super.engineStart();
        System.out.println("Ferrari is ready......");
    }

    @Override
    public void gearChange() {
        super.gearChange();
        System.out.println("Speed is increased......");
    }
}
