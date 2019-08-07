package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(ar));
        int a=s.nextInt();
        int b=s.nextInt();
        swap(a,b,ar);
        System.out.println(Arrays.toString(ar));
    }

   public static void swap(int x,int y,int a[])
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

}
