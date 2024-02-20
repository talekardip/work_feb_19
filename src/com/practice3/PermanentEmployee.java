package com.practice3;

public class PermanentEmployee implements Employee{


    private String employeeName;
    private int baseSalary;
    private int noOfHours;

    public PermanentEmployee(String employeeName,int baseSalary,int noOfHours){
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
        return baseSalary+noOfHours*40;
    }

    @Override
    public void getEmployeeInfo(){
        System.out.println(toString());
    }
}
