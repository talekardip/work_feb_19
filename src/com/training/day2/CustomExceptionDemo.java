package com.training.day2;

public class CustomExceptionDemo {
    void validateAge(int age)  throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age should be more than 18");
        }
        else{
            System.out.println("Age is Fine");
        }
    }
}
