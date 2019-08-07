package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i <ar.length; i++) {
            ar[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
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
        int first=0;
        int last=arr.length-1;
        while (first<=last){
            int mid=(first+last)/2;
            if (arr[mid]==ele){
                return mid;
            }
            else if (ele<arr[mid]){
                last=mid-1;
            }
            else {
                first=mid+1;
            }
        }
        return -1;
    }
}
