package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

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
        t1.join();

        System.out.println("\nThreads with ReentrantLock:\n");

        ReentrantLock locker = new ReentrantLock();
        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 1; i<6; i++){
            Thread t = new Thread(new NumberThreads(number,locker));
            t.setName("Thread " + i);
            t.start();
            t.join();
        }


        System.out.println("\nThreads with Synchronized:\n");


        ArrayList<Integer> number1 = new ArrayList<>();
        for(int i = 1; i<6; i++){
            Thread t = new Thread(new NumberTreadsSyn(number1));
            t.setName("Thread " + i);
            t.start();
        }

    }
}
