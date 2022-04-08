package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class NumberThreads implements  Runnable {
    ArrayList<Integer> number;
    ReentrantLock locker;

    NumberThreads(ArrayList<Integer> number,ReentrantLock lock){
        this.number = number;
        this.locker = lock;
    }

    @Override
    public void run() {
        locker.lock();
        try {
            for (int i = 0; i < 4; i++) {
                number.add(i);
                System.out.printf("%s, %d \n", Thread.currentThread().getName(), number.get(i));
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
    }

    }
}
