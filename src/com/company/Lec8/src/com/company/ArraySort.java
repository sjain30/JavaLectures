package com.company;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <size; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println(sorted(arr,0));
    }

    public static boolean sorted(int ar[], int index)
    {
        if (index==ar.length-1){
            return true;
        }
        if (ar[index]>ar[index+1]){
            return false;
        }
        return sorted(ar,index+1);
    }
}
