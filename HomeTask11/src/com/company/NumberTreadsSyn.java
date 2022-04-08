package com.company;

import java.util.ArrayList;

public class NumberTreadsSyn implements Runnable{
    private final ArrayList<Integer> number;

    public NumberTreadsSyn(ArrayList<Integer> number) {
        this.number = number;
    }

    @Override
    public void run() {
        synchronized (number){
            for (int i = 0; i < 4; i++) {
                number.add(i);
                System.out.printf("%s, %d \n", Thread.currentThread().getName(), number.get(i));
            }
            try{Thread.sleep(100);

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
       }

    }
}
