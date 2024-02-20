package com.training;

public class Employee {
    private String empId;
    private String empName;
    private double salary;

    public Employee(){

    }

    public Employee(String empId, String empName,double salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId){
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
