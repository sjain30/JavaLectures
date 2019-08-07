package com.company.Lec11;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int first[]={2,4};
        int second[]={3,5};
        System.out.println(Arrays.toString(Merge(first,second)));
    }

    public static int[] Merge(int first[], int second[])
    {
        int mix[]=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                mix[k++]=first[i++];
            }
            else {
                mix[k++]=second[j++];
            }
        }
        while (i<first.length){
            mix[k++]=first[i++];
        }
        while (j<second.length){
            mix[k++]=second[j++];
        }
        return mix;
    }
}
