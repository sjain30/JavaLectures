package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size= s.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i <size; i++) {
            arr[i]= s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //Isort(arr);
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void Isort(int ar[]){
//        for (int i = 1; i <ar.length; i++) {
//            int temp=ar[i];
//            int j=i-1;
//            while ((ar[j]>temp)&&(j>=0)){
//                //while ((j>=0)&&(ar[j]>temp)){
//                    ar[j+1]=ar[j];
//                    j-=1;
//                }
//                ar[j+1]=temp;
//            }
//        }

    public static void insertion(int ar[])
    {
        for (int i = 0; i <ar.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (ar[j]<ar[j-1]){
                    com.company.ArraySwap.swap(j,j-1,ar);
                }
                else {
                    break;
                }
            }
        }
    }
    }

