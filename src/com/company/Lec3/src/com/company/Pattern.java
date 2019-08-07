package com.company;

public class Pattern {
    public static void main(String[] args) {
        int n=10;
        int row=1;
        while(row<=n){
            int col=1;
            while(col<=row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
