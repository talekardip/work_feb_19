package com.training.day2;

@FunctionalInterface
public interface MyFunctionalInterface {
    int getSum(int a,int b);
    default void populateLog(String str){
        System.out.println("logging..."+str);
    }
}
// any function is in interface is abstract
//functional interface is interface that has only one abstract method
