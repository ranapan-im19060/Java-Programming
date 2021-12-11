package com.company;

public class Animal {

    private String name;
    private int legs;
    private int weight;

    public Animal(String name, int legs, int weight) {
        this.name = name;
        this.legs = legs;
        this.weight = weight;
    }

    public Animal(){
        System.out.println("Empty constructor called......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void talking(){
        System.out.println("I am talking");
    }

    public void walking(){
        System.out.println("I am talking");
    }
}
