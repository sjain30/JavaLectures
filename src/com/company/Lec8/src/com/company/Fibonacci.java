package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        System.out.println(fibo(f));
    }

    public static int fibo (int n)
    {
        if (n<2){
            return n;
        }
         return fibo(n-1)+fibo(n-2);
    }
}
