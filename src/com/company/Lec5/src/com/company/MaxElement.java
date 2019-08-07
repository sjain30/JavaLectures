package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i <size; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println("Maximum element : "+max(ar));
    }

    public static int max(int a[])
    {
        int big=a[0];
        for (int i = 1; i <a.length; i++) {
            if (a[i]>big)
            {
                big=a[i];
            }
        }
        return big;
    }
}
