package com.company;

public class Dog extends Animal{

    private int eyes;
    private String dogName;

    public Dog(String name,  int weight, int eyes, String dogName) {
        super(name, 4, weight);
        this.eyes = eyes;
        this.dogName = dogName;
    }

    public Dog(int eyes, String dogName) {
        this.eyes = eyes;
        this.dogName = dogName;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    private void chew(){
        System.out.println("chew chew chew");
    }

    @Override
    public void walking(){
        chew();
        System.out.println("Dog is walking.....");
    }
}
