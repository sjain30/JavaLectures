package com.company;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int vmr=1;
        int row=1;
        while(vmr<=2*n-1){
            int col=1;
            while(col<=row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            if(vmr<n){
                row++;
            }
            else{
                row--;
            }
            vmr++;
        }
    }
}
