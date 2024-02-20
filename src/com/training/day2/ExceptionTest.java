package com.training.day2;

public class ExceptionTest {
    public static void main(String... args){
        CustomExceptionDemo obj = new CustomExceptionDemo();
        try {
            obj.validateAge(1);
        }
        catch(InvalidAgeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
