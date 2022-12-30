package com.company;

public class Account {

    private double balance;

    public Account(double initialBalance) {
        if(initialBalance > 0.0){
            balance=initialBalance;
        }
    }

    public void credit(double amount){
        balance = balance +amount;
    }

    public  double getBalance(){
        return balance;
    }

    public void debit(double debitValue){
        if(balance-debitValue>=0){
                balance = balance - debitValue;
                System.out.println("Withdraw amount --> " + debitValue);
                System.out.println("Your current value " + balance);
        }else {
            System.out.println("Debit amount exceeded account balance.\" ");
        }
    }
}
