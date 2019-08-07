package com.company;

import java.util.Scanner;

public class BintoDec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bin = s.nextInt();
        System.out.println("Decimal Number: "+b2d(bin));
    }

    public static int b2d(int b)
    {
        int deci=0;
        int place=1;
        while (b>0)
        {
            int rem=b%10;
            deci+=rem*place;
            b/=10;
            place*=2;
        }
        return deci;
    }
}
