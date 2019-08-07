package com.company.Lec11;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] ={3,4,8,7,5,1};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    public static int[] mergesort(int nums[])
    {
        if (nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int first[]= mergesort(Arrays.copyOfRange(nums,0,mid));
        int second[] = mergesort(Arrays.copyOfRange(nums,mid,nums.length));
        return MergeArray.Merge(first,second);
    }
}
