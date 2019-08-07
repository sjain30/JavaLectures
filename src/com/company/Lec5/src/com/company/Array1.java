package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[5];
        for (int i = 0; i <ar.length; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ar));
    }
}
