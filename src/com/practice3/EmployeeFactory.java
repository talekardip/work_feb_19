package com.practice3;

public class EmployeeFactory {
    public static Employee getEmployee(String employeeType,String employeeName, int baseSalary,int noOfHours){
        if(employeeType.equalsIgnoreCase("Temporary"))  return new TemporaryEmployee(employeeName,baseSalary,noOfHours);
        else return new PermanentEmployee(employeeName,baseSalary,noOfHours);
    }
}
