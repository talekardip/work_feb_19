package com.training;


import java.util.Scanner;

class AccountTest {

    //can use static as it will not create object
    public static int calAge(Account acc[]){
        int tot = 0;
        for(Account a:acc){
            tot+=a.getAge();
        }
        return tot;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter account Name:");
//        String accountName = sc.next();
//        System.out.println("Enter account Number:");
//        String accountNumber = sc.next();
//
//
//        Account a1 = new Account(accountName, accountNumber);
//        System.out.println("Enter withdrawl amount");
//        Double withdrawlamount = sc.nextDouble();
//        a1.withdrawl(withdrawlamount);
//        System.out.println("Enter deposit");
//        Double depositamount = sc.nextDouble();
//        a1.deposit(depositamount);
//        System.out.println("your balance is " + a1.showBalance());
//        System.out.println("Enter withdrawl amount");
//        withdrawlamount = sc.nextDouble();
//        a1.withdrawl(withdrawlamount);
//        System.out.println("your balance is " + a1.showBalance());
//
//        System.out.println(a1);

        Account acc[] = new Account[5];
        for(int i=0;i<5;i++){
            acc[i] = new Account("he"+i,"INOO"+i);
            acc[i].setAge(i*(1+i));
        }

        double avgAge = calAge(acc);

        avgAge/=5;

        System.out.println("Average age is "+avgAge);

    }
}