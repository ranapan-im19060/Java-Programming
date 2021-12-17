package com.company;

public class Plant {

    private String varient;

    public Plant(String varient) {
        this.varient = varient;
    }

    public String getVarient() {
        return varient;
    }

    public void setVarient(String varient) {
        this.varient = varient;
    }

    public void production(){
        System.out.println("C2H1207");
    }
}
