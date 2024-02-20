package com.day2homework;

import java.util.Random;

public class RandomThread extends Thread{
    private int targetNumber;
    private int totalAttempts;
    private int threadNumber;

    public RandomThread(int targetNumber,int threadNumber){
        this.targetNumber = targetNumber;
        this.totalAttempts = 0;
        this.threadNumber = threadNumber;
    }

    public int getThreadNumber() {
        return threadNumber;
    }

    public void setThreadNumber(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public int getTotalAttempts() {
        return totalAttempts;
    }

    @Override
    public synchronized void run(){

        System.out.println("ThreadNo: "+threadNumber+" is started...");
        Random random = new Random();
        int guessedNumber;
        do{
            guessedNumber = random.nextInt(10);
            totalAttempts++;
            System.out.println("ThreadNo: "+threadNumber+" , AttemptNo: "+totalAttempts);
        }while (guessedNumber!=targetNumber);
        System.out.println("ThreadNo: "+threadNumber+" is finished....");

    }





}
