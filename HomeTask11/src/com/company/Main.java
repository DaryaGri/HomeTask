package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadT1());
        Thread t2 = new Thread(new ThreadT2());
        Thread t3 = new Thread(new ThreadT3());

        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();

    }
}
