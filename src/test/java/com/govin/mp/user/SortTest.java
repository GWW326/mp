package com.govin.mp.user;


public class SortTest {
    public static void main(String[] args) {
       int[] s = {1,56,23,2,59,79};
        int[] sort = sort(s);
        for (int a:  sort ) {
            System.out.println(a);
        }
    }
   public static int[] sort(int [] a){
       for (int i = 0; i <a.length-1 ; i++) {
           for (int j = a.length-1-i; j > i; j--) {
               if(a[i]>a[j]){
                   int temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       return a;
   }

}
