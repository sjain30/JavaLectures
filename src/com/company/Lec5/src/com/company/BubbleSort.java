package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[5];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        bsort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bsort(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-1-i; j++) {
                if (arr[j+1]<arr[j]){
                    com.company.ArraySwap.swap(j,j+1,arr);
                }
            }
        }
    }
}
