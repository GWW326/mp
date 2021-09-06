package com.govin.mp.user;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable implements Runnable {
    public void setIncr(boolean incr) {
        isIncr = incr;
    }

    private boolean isIncr = true;

    public MyRunnable(boolean isIncr) {
        this.isIncr = isIncr;
    }

    private   static int i = 10;
    @Override
    public void run() {
        if(isIncr){
            i++;
            System.out.println("i++="+i);
        }else {
           i--;
            System.out.println("i--="+i);
        }
    }
}
