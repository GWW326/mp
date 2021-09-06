package com.govin.mp.user;


public class TestSort {
    public static void main(String[] args) {
        int[] arr = {1, 52, 56, 4, 3,};
        System.out.println("max--"+getMax(arr));
        System.out.println("min--"+getMin(arr));
        System.out.println("avg--"+getAvg(arr));
    }

    /**
     * 找出最大值
     * 最小值
     * 平均值
     *
     * @param a
     * @return
     */
    public static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;

    }

    public static int getMin(int[] b) {
        int min = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        return min;
    }
    public static int getAvg(int[] b) {
        int sum=0;
        for (int i = 0; i < b.length; i++) {
           sum+=b[i];
        }
        return sum/b.length;
    }
}
