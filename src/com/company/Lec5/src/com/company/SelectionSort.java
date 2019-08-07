package com.company;

import com.company.MaxIndex;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[5];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        ssort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void ssort(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            int maxi= MaxIndex.max(arr,arr.length-i);
            com.company.ArraySwap.swap(maxi,arr.length-1-i,arr);
        }
    }
}
