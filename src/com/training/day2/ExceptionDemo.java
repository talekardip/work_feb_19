package com.training.day2;

import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String... args){
        //checked excetpions
//        FileReader fileReader = new FileReader("demo.txt");
        try {
            int x= 0;
            int y = 5/x;
        }
        catch (ArithmeticException | IllegalArgumentException e){
            System.out.println("Arithmetic error occured.. "+e);
        }
        finally {
            System.out.println("final block..");
        }
        System.out.println("Program continues...");
    }
}
