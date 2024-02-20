package com.practice3;

public class TemporaryEmployee implements Employee{
    private int baseSalary;
    private int noOfHours;
    private String employeeName;
    public TemporaryEmployee(String employeeName,int baseSalary,int noOfHours){
        this.baseSalary = baseSalary;
        this.noOfHours = noOfHours;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }





    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public String toString() {
        return "PermanentEmployee{" +
                "employeeName='" + employeeName + '\'' +
                ", baseSalary=" + baseSalary +
                ", noOfHours=" + noOfHours +
                '}';
    }
    @Override
    public double getEmployeeSalary() {
        return noOfHours*50;
    }
    @Override
    public void getEmployeeInfo(){
        System.out.println(toString());
    }
}
