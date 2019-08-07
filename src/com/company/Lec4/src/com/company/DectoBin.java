package com.company;

import java.util.Scanner;

public class DectoBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int deci = s.nextInt();
        System.out.println("Binary Number: "+ d2b(deci));
    }

    public static int d2b(int d)
    {
        int bin=0;
        int place=1;
        while (d>0)
        {
            int rem=d%2;
            bin+=rem*place;
            d/=2;
            place*=10;
        }
        return bin;
    }
}
