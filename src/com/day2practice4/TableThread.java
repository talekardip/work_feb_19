package com.day2practice4;

public class TableThread implements Runnable{
    private String threadName;
    private Thread t;
    private int number;

    public TableThread(String threadName,int number){
        this.threadName = threadName;
        this.number = number;
        System.out.println("Creating "+threadName+" having number "+number);
    }

    @Override
    public void run(){
        System.out.println("Running "+threadName+" having number "+number);

            for(int i=1;i<=10;i++){
                System.out.println(number+"*"+i+" = "+number*i);

            }


        System.out.println("Thread "+threadName+" is exiting");
    }


}
