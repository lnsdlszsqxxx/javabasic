package mygroup;

import java.time.LocalTime;

public class Fibonacci {

    public static int[] memo=new int[50];

    public static void main(String[] args) {
        int n=45;
        long start = System.nanoTime();
        System.out.println(fib1(n));
        long time1 = System.nanoTime();
        System.out.println(fib2(n));
        long time2 = System.nanoTime();
        System.out.println(fib3(n));
        long time3 = System.nanoTime();

        System.out.println(start);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println((time1-start)+", "+(time2-time1)+", "+(time3-time2));
    }

    public static int fib1(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return fib1(n-1)+fib1(n-2);
    }

    public static int fib2(int n){
        if(memo[n]!=0) return memo[n];
        if(n==1) return 1;
        if(n==2) return 2;
        memo[n] = fib2(n-1)+fib2(n-2);
        return memo[n];
    }

    public static int fib3(int n){
        int a1=1;
        int a2=2;
        int a3=0;

        for(int i=2;i<n;i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        return a3;
    }


}
