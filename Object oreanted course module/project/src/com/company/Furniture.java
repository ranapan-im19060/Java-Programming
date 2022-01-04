package com.company;

public class Furniture extends Inventory {

    public String type;
    public String manufacture;

    public Furniture(String type, String manufacture) {
        this.type = type;
        this.manufacture = manufacture;
    }

    public String getType() {
        return type;
    }


    public String getManufacture() {
        return manufacture;
    }

}
