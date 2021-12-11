package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(10,0,true);
	    printer.filltoner(20);
	    printer.pinting(30);
        System.out.println(printer.getPagesPrinted());
    }
}
