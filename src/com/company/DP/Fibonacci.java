package com.company.DP;

public class Fibonacci {
    public static void main(String[] args) {
        int n=78;
//        System.out.println(fibo(n));
        int ar[] = new int[n+1];
        System.out.println(fiboDp(n,ar));
        System.out.println(fiboiterative(n));
    }

    public static int fibo(int n)
    {
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static int fiboDp(int n, int mem[])
    {
        if (n<2){
            return n;
        }
        if (mem[n]!=0){
            return mem[n];
        }
        mem[n]=fiboDp(n-1,mem)+fiboDp(n-2,mem);
        return mem[n];
    }

    public static int fiboiterative(int n)
    {
        int mem[] = new int[n+1];
        mem[0]=0;
        mem[1]=1;
        for (int i = 2; i <n+1; i++) {
            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }
}
