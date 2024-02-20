package com.training.day2;

public class RunnableThread implements Runnable{
    private Thread t;
    private String threadName;

    public RunnableThread(String threadName){
        this.threadName = threadName;
        System.out.println("Creating "+threadName);
    }
    @Override
    public void run(){
        System.out.println("Runnable "+threadName);
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " Thread:: " + threadName);
                Thread.sleep(1000);//Block state
            }
        }
        catch (InterruptedException e){
            System.out.println("interupted "+threadName);
        }
        System.out.println("Thread "+threadName+" is exiting");
    }
}
