package com.company.Lec3;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int vmr=1;
        int row=1;
        while(vmr<=2*n-1){
            int hmir=1;
            int col=1;
            while(hmir<=2*n-1) {
                if (col <= n-row) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(col);
                }
                if (hmir < n) {
                    col++;
                }
                else {
                    col--;
                }
                hmir++;
            }
            System.out.println();
            if (vmr < n) {
                row++;
            }
            else {
                row--;
            }
            vmr++;
        }
    }
}
