package com.company;

public class MotherBoard {

    private String model;
    private  String manufacture;
    private int ramSlots;
    private String bios;
    private int cardSlots;

    public MotherBoard(String model, String manufacture, int ramSlots, String bios, int cardSlots) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.bios = bios;
        this.cardSlots = cardSlots;
    }

    public void loadProgramme(String programmeName){
        System.out.println("Programme "+programmeName + " is loaded....");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public String getBios() {
        return bios;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
