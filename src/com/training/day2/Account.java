package com.training.day2;

public class Account {
    double amount = 1000;
    synchronized void withdraw(double amount) throws InterruptedException {
        System.out.println("Withdrawing..");
        if(this.amount<amount){
            System.out.println("Waiting for deposit..");
            wait();
        }
        this.amount -= amount;
        System.out.println("Withdraw completed");
    }

    synchronized void deposit(double amount){
        System.out.println("Depositing...");
        this.amount+=amount;
        System.out.println("Deposit completed");
        notify();
    }


}
