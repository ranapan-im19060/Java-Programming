package com.company;

public class Car {

    private String manufacture;
    private int numberOfAirbags;
    private int engineCapacity;
    private String modelName;
    private int numberOfTyres;

    public Car() {
        this("Toyota",2,1300,"Vitz",4);
    }

    public Car(String manufacture, int numberOfAirbags, int engineCapacity, String modelName, int numberOfTyres) {
        this.manufacture = manufacture;
        this.numberOfAirbags = numberOfAirbags;
        this.engineCapacity = engineCapacity;
        this.modelName = modelName;
        this.numberOfTyres = numberOfTyres;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getNumberOfAirbags() {
        return numberOfAirbags;
    }

    public void setNumberOfAirbags(int numberOfAirbags) {
        this.numberOfAirbags = numberOfAirbags;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public void engineStart(){
        System.out.println("Engine is started.........");
    }

    public void gearChange(){
        System.out.println("Gear is changed......");
    }

    public void engineStop(){
        System.out.println("Engine is stopped.........");
    }
}
