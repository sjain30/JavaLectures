package com.company;

public class Swap {
    public static void main(String[] args) {
        Swap sa = new Swap();
        int a=6;
        int b=7;
        System.out.println(a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }

    public static void swap(int c, int d)
    {
        int temp=c;
        c=d;
        d=temp;
        System.out.println(c+" "+d);
    }
}
