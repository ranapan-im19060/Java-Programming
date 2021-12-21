package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        SeatType seatA = new SeatType(10,500);
        SeatType seatB = new SeatType(20,250);
        SeatType seatC = new SeatType(30,150);

        int totalSales = seatA.getNumberOfTicketSold()*seatA.getPriceOfTheTicket() + seatB.getNumberOfTicketSold()*seatB.getPriceOfTheTicket()  + seatC.getNumberOfTicketSold()*seatC.getPriceOfTheTicket();
        System.out.println("Total Sales " + totalSales);






	 /*
	 Task 01

        NumberHolder numberHolder1 = new NumberHolder();
    	Counter counter = new Counter();
        numberHolder1.aFloat = 100;
	    numberHolder1.anInt = 20;
        System.out.println(numberHolder1.aFloat);
        System.out.println(numberHolder1.anInt);




    // Task 02
        counter.increment();
        counter.increment();
        counter.getValue();*/



        /*

      //Task 03
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);

        System.out.printf("Account 1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf("Account 2 balance: $%.2f\n", account2.getBalance() );

        Scanner input = new Scanner(System.in);
        double withdrawelAmount;

        System.out.printf("Enter withdrawel amount from account1 : ");
        withdrawelAmount = input.nextDouble();
        System.out.printf("\nsubstracting %.2f from account1 balance\n", withdrawelAmount);

        account1.debit(withdrawelAmount);

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n", account2.getBalance());

        System.out.printf("Enter withdrawel amount from account2 : ");
        withdrawelAmount = input.nextDouble();
        System.out.printf("\nsubstracting %.2f from account1 balance\n", withdrawelAmount);

        account2.debit(withdrawelAmount);

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n", account2.getBalance());*/




/*


     //Task 4
        GradeBook gradeBook1 = new GradeBook("CS101");
        gradeBook1.setInstructor("Chinthaka");
        gradeBook1.displayMessage();

        GradeBook gradeBook2  = new GradeBook("CS101","Minol");
        gradeBook2.displayMessage();*/





        //Task5

      /*  Employee employee1 = new Employee("Dilan","Chamuditha",200000);
        System.out.println("\n\nEmployee name "+employee1.getFirstName()+" "+employee1.getLastName());
        System.out.println(employee1.getSalary());
        employee1.salaryIncrease(10);
        System.out.println(employee1.getSalary());


        Employee employee2 = new Employee("Madushika","Marapana", 200000);
        System.out.println("\n\nEmployee name "+employee2.getFirstName()+" "+employee2.getLastName());
        System.out.println(employee2.getSalary());
        employee2.salaryIncrease(20);
        System.out.println(employee2.getSalary());*/

        //Task 06
/*
        SeatType seatA = new SeatType(10,500);
        SeatType seatB = new SeatType(20,250);
        SeatType seatC = new SeatType(30,150);

        int totalSales = seatA.getNumberOfTicketSold()*seatA.getPriceOfTheTicket() + seatB.getNumberOfTicketSold()*seatB.getPriceOfTheTicket()  + seatC.getNumberOfTicketSold()*seatC.getPriceOfTheTicket();
        System.out.println("Total Sales " + totalSales);*/
    }
}
