package com.training;

public class Account {
    private String accountNumber;
    private String accountName;
    private int age;
    private double balance;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account(){
        this.balance = 0;
    }

    public Account(String accName,String accNumber){
        this.accountName = accName;
        this.accountNumber = accNumber;
        this.balance = 0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }



    public double showBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        if(amount<0){
            System.out.println("amount can't be negative....");
            return;
        }
        balance+=amount;
        System.out.println("Deposit successful....");
    }

    public void withdrawl(double amount){
        if(amount<0){
            System.out.println("amount can't be negative....");
            return;
        }
        if(amount>balance){
            System.out.println("Balance is less..");
            return;
        }
        balance-=amount;
        System.out.println("Amount withdrawl successful...");
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                '}';
    }
}
