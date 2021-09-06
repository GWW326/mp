package com.govin.mp.user;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class RandomRunnable implements Runnable {
    private  Integer start;
    private  Integer end;
    public static Set<Integer> set = new HashSet<>();
    private final  CountDownLatch countDownLatch;

    public RandomRunnable(Integer start, Integer end, CountDownLatch countDownLatch) {
        this.start = start;
        this.end = end;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

            for (int i = start; i < end; i++) {
            set.add(i);
            }
            countDownLatch.countDown();
        System.out.println("set.size()---"+set.size());
    }
}
