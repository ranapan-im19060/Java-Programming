package com.company;

public class SeatType {

    private int numberOfTicketSold;
    private int priceOfTheTicket;

    public SeatType(int numberOfTicketSold, int priceOfTheTicket) {
        this.numberOfTicketSold = numberOfTicketSold;
        this.priceOfTheTicket = priceOfTheTicket;
    }

    public int getNumberOfTicketSold() {
        return numberOfTicketSold;
    }

    public void setNumberOfTicketSold(int numberOfTicketSold) {
        this.numberOfTicketSold = numberOfTicketSold;
    }

    public int getPriceOfTheTicket() {
        return priceOfTheTicket;
    }

    public void setPriceOfTheTicket(int priceOfTheTicket) {
        this.priceOfTheTicket = priceOfTheTicket;
    }
}
