package com.govin.mp.user;

public class Hui {
    public static void main(String[] args) {
        int a = 12343210;
        boolean test = test(a);
        System.out.println("是回文数--"+test);
    }

    public static boolean test(int i) {
        StringBuilder sb = new StringBuilder(i+"");
        String s = sb.toString();
        StringBuilder reverse = sb.reverse();
        String s1 = reverse.toString();
        System.out.println("s--"+s);
        System.out.println("s1--"+s1);
        boolean isHuiwen = true;
        if(s.length()!=s1.length()){
            return !isHuiwen;
        }
        for (int j = 0; j < s.length()-1; j++) {
           if(s.charAt(j)!=s1.charAt(j)){
               isHuiwen =false;
               break;
           }

        }
        return isHuiwen;
    }
}
