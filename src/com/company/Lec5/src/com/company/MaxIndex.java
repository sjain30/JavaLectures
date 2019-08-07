package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[5];
        for (int i = 0; i <ar.length; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println("Maximum index : "+max(ar,ar.length));
    }

    public static int max(int a[], int len)
    {
        int big=0;
        for (int i = 1; i <len; i++) {
            if (a[i]>a[big])
            {
                big=i;
            }
        }
        return big;
    }
}
