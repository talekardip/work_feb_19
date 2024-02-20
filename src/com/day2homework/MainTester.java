package com.day2homework;

import java.util.Random;

public class MainTester {
    public static void main(String... args) throws InterruptedException {
        int targetNumber = new Random().nextInt(10);
        RandomThread[] randomThreads = new RandomThread[8];

        //create and start threads
        for(int i=0;i<8;i++){
            randomThreads[i] = new RandomThread(targetNumber,i);
            randomThreads[i].start();
        }

        //wait for all other threads to finish inorder
//        for(RandomThread thread:randomThreads){
//            thread.join();
//        }

        //print totalattempts for each thread

        for(RandomThread thread:randomThreads){
            System.out.println("ThreadNo: "+thread.getThreadNumber()+" total attempts "+thread.getTotalAttempts());
        }



    }
}
