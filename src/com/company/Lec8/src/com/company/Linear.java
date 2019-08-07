package com.company;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i <size; i++) {
            arr[i]= scan.nextInt();
        }
        int item = scan.nextInt();
        System.out.println(sorted(arr,0,item));
    }

    public static boolean sorted(int ar[], int index,int ele)
    {
        if (index==ar.length){
            return false;
        }
        if (ar[index]==ele){
            return true;
        }
        return sorted(ar,index+1,ele);
    }
}
