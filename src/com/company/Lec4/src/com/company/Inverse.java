package com.company;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int place=1;
        int num=0;
        while(n>0)
        {
            int rem=n%10;
            num+=place++*(int)Math.pow(10,(rem-1));
            n/=10;
        }
        System.out.println("Inverse of n is "+num);
    }
}
