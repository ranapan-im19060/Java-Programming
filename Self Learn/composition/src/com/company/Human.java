package com.company;

public class Human {

    private int height;
    private int width;
    private String name;

    public Human(int height, int width, String name) {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println("Walking........");
    }

    public void reading(){
        System.out.println("Reading........");
    }
}
