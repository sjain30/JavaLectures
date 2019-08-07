package com.company.Lec12;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] ={2,5,1,3,4 };
        quickie(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickie(int[] num,int start, int end)
    {
        if (end<=start){
            return;
        }
        int pivot=end-1;
        pivot=pivotadjust(num,start,pivot);
        quickie(num,0,pivot);
        quickie(num,pivot+1,end);
    }

    private static int pivotadjust(int[] num, int start, int pivot)
    {
        int j=start;
        for (int i = start; i <pivot; i++) {
            if (num[i]<num[pivot]){
                int temp=num[j];
                num[j]=num[i];
                num[i]=temp;
                j++;
            }
        }
        int temp=num[j];
        num[j]=num[pivot];
        num[pivot]=temp;
        return j;
    }
}
