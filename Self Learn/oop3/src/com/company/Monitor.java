package com.company;

public class Monitor {

    private String model;
    private String manufactures;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String manufactures, int size, Resolution resolution) {
        this.model = model;
        this.manufactures = manufactures;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufactures() {
        return manufactures;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
