package com.company;

import java.util.Scanner;

public class CtoF {

    public static void converter(int start, int end, int ste)
    {
        while (start<=end)
        {
            float c=(5f/9)*(start-32);
            System.out.println(c);
            start+=ste;
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        int step=s.nextInt();
        converter(start,end,step);
    }
}
