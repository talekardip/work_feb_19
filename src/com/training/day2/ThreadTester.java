package com.training.day2;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        /*
        //m1
        ThreadDemo t1 = new ThreadDemo();//Thread is born-new state
        t1.start(); // runnable


        //m2
        RunnableThread r1 = new RunnableThread();   //instance is created
        Thread t2 = new Thread(r1);     // now thread is created
        t2.start();
        */
        /*
        RunnableThread r1 = new RunnableThread("Thread-1");   //instance is created
        Thread t1 = new Thread(r1);     // now thread is created
        t1.start();


        RunnableThread r2 = new RunnableThread("Thread-2");   //instance is created
        Thread t2 = new Thread(r2);     // now thread is created
        t1.join();
        t2.start();
        */
        Account account = new Account();
        new Thread(){
            public void run(){
                try {
                    account.withdraw(1200);
                }
                catch(InterruptedException e){
                    System.out.println("interrupted");

                }
            }
        }.start();

        new Thread(){
            public void run(){

                    account.deposit(1200);

            }
        }.start();



    }
}
