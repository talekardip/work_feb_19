package com.practice3;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee("Permanent","tom",50000,6);
        System.out.println(employee1.getEmployeeSalary());
        employee1.getEmployeeInfo();
    }
}
