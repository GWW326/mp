package com.govin.mp.user;

public class RunTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(true);
        MyRunnable myRunnable1 = new MyRunnable(true);
        MyRunnable myRunnable2 = new MyRunnable(false);
        MyRunnable myRunnable3 = new MyRunnable(false);
        new Thread(myRunnable1).start();
        new Thread(myRunnable2).start();
        new Thread(myRunnable3).start();
        new Thread(myRunnable).start();

    }
}
