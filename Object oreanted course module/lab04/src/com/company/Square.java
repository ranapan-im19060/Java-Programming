package com.company;

public class Square {

    private double side;

    public void setSide(double side) {
        if(side>0.0){
            this.side = side;
        }else{
        this.side = 1.0;}
    }

    public Square() {
        setSide(1.0);
    }

    public double getSide() {
        return side;
    }

    public Square(double side) {
        setSide(side);
    }

    public void computeArea(){
        System.out.println("Area --> " + side*side);
    }
}
