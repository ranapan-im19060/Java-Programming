package com.company;

public class Electronic extends Inventory {

    public String type;
    public String manufacture;

    public Electronic(String type, String manufacture) {
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
