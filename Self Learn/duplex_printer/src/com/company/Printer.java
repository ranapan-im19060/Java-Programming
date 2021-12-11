package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isduplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isduplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isduplex = isduplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isIsduplex() {
        return isduplex;
    }

    public void filltoner(int precentage){
        if(tonerLevel < 100){
            tonerLevel = tonerLevel + precentage;
        }
    }

    public void pinting(int numberOfPrintedPages){
        if(isduplex == true){
            pagesPrinted = pagesPrinted + (numberOfPrintedPages/2);
        }else{
            pagesPrinted = pagesPrinted + numberOfPrintedPages;
        }

    }
}
