package com.company.Lec12;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 0;
        while (row < n) {
            int r = 0;
            while (r <= row) {
                int col=r;
                if (col > row - col) {
                    col = row - col;
                }
                int res = 1;
                for (int i = 0; i < col; i++) {
                    res = res * (row - i);
                    res = res / (i + 1);
                }
                System.out.print(res + " ");
                r++;
            }
            System.out.println();
            row++;
        }
    }
}
