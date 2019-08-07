package com.company.Lec3;

import java.util.*;
public class DoubleSidedArrow {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int vmr=1;
        int row=1;
        int space=n-1;
        while(vmr<=n){

            int col=row;
            int space1=1;
            while(space1<=space){
                System.out.print("  ");
                space1++;
            }
            while(col>=1){
                System.out.print(col+" ");
                col--;
            }
            space1=1;
            while(space1<=(2*(row-1)-1)){
                System.out.print("  ");
                space1++;
            }
            col=1;
            if (row!=1) {
                while (col <= row) {
                    System.out.print(col + " ");
                    col++;
                }
            }
            if(vmr<(n+1)/2){
                row++;
                space-=2;
            }
            else{
                row--;
                space+=2;
            }
            System.out.println();
            vmr++;
        }
    }
}