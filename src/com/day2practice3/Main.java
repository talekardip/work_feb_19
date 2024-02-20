package com.day2practice3;

import com.day2practice3.Employee;
import com.training.day2.CustomExceptionDemo;
import com.training.day2.InvalidAgeException;

public class Main {
    public static void main(String... args){
        Employee e1 = new Employee();
        e1.setName("Dipesh");
        e1.setSalary(1000);

        try {
            e1.validateSalary();
        }
        catch(InvalidSalaryException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
