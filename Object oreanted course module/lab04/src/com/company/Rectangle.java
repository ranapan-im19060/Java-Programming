package com.company;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    //default constructor
    public Rectangle() {
        this(1,1);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(int length) {
        if(length>0.0 && length < 20.0){
            this.length = length;
        }else{
        System.out.println("Error");}
    }

    public void setWidth(int width) {
        if(width>0.0 && width < 20.0){
            this.width = width;
        }else{
        System.out.println("Error");}
    }

    public void perimeter(){
        double parameter  = 2 * (width + length);
        System.out.println("Parameter is " + parameter);
    }

    public void area(){
        double area  =  width*length;
        System.out.println("Area is " + area);
    }
}
