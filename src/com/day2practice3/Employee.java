package com.day2practice3;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String name;
    private int salary;


    public void validateSalary() throws InvalidSalaryException{
        if(this.salary<20000){
            throw new InvalidSalaryException("Salary should be more than 20000");
        }
        else{
            System.out.println("Salary is fine");
        }
    }
}
