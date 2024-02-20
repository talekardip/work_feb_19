package com.day2practice4;

public class Table {
    void printTable(int n){
        synchronized(this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
            }
        }
    }
}
