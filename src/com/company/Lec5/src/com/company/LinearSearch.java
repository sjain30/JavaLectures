package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i <size; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println("Enter element to search : ");
        int item=s.nextInt();
        int res=search(ar,item);
        if (res!=-1){
            System.out.println("Element Found at "+res);
        }
        else {
            System.out.println("Not found");
        }
    }

    public static int search(int arr[], int ele){
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
}
