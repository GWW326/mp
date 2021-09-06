package com.govin.mp.user;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ProTest {
    public static void main(String[] args) throws InterruptedException {

        Long start = System.currentTimeMillis();

        CountDownLatch count = new CountDownLatch(2);
        RandomRunnable runnable = new RandomRunnable(1,5000000,count);
        RandomRunnable runnable1 = new RandomRunnable(5000000,10000001,count);
        new Thread(runnable).start();
        //new Thread(runnable1).start();
        Set <Integer> set = RandomRunnable.set;
        Long end = System.currentTimeMillis();
        Iterator <Integer> iterator = set.iterator();
        count.await(10, TimeUnit.SECONDS);
        if(iterator.hasNext()){
            System.out.println("打印结果---"+iterator.next());
        }
        System.out.println(set.size());

    }

    /**
     * 生成1-1000w的所有数字
     * @return
     */

}
