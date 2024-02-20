package com.day2practice1;

public class LambdaMain {
    public static void main(String... args) {
        OddEvenInterface obj = (a) -> a % 2 == 0 ? "Even" : "Odd";
        System.out.println(obj.isOddEven(3));
    }
}
