package com.training;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> list;

    static {
        list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello world!");
//
//        Employee emp1 = new Employee();
//        emp1.setEmpId("IN101");
//        emp1.setEmpName("Tom");
//        emp1.setSalary(2000);
//
//
//
//        Employee emp2 = new Employee("IN102","Johnny",3000);
//
//
//
//        System.out.println("enter empid");
//        String empId = sc.next();
//        System.out.println("enter empname");
//        String empName = sc.next();
//        System.out.println("enter empid");
//        double salary = sc.nextDouble();
//
//        Employee emp3 = new Employee(empId,empName,salary);
//
//        System.out.println(emp1);
//        System.out.println(emp2);
//        System.out.println(emp3);


//        Bank sbiBank = new SBI();
//        sbiBank.setBankName("SBI");
//        sbiBank.setBankId("101");
//        System.out.println(sbiBank.getBankDetail());
//        sbiBank.setAmount(10000);
//        sbiBank.setYears(5);
//        sbiBank.setInterestRate(4);
//        System.out.println(sbiBank.getMaturity());
//
//        Bank hdfcBank = new HDFC();
//        hdfcBank.setBankName("HDFC");
//        sbiBank.setBankId("202");
//        sbiBank.setAmount(23400);
//        sbiBank.setYears(6);
//        sbiBank.setInterestRate(5);
//        System.out.println(sbiBank.getMaturity());

//        Bank b = new SBI();
//        System.out.println(b.getInterestRate());

//        Student hosteller = new Hosteller();
//        Student dayScholar = new DayScholar();

        // we are using factory desgin pattern to not tell the main which object is used
        // we create object in StudentFactory file based on studenttype input
//        Student student1 = StudentFactory.getStudent("hosteller");
//        student1.getStudentInfo();


    }
    /*
    private static int getSum(int a,int b){
        return a+b;
    }

    private static int getSum(int a,int b,int c){
        return a+b+c;
    }
*/
    private static int getSum(int... a){//varargs
        int tot = 0;
        //no of arguments use : a.length
        for(int i:a)    tot+=i;
        return tot;
    }
}