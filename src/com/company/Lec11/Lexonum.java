package com.company.Lec11;

import java.util.Scanner;

public class Lexonum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        lexonum(0,n);
    }

    public static void lexonum(int present, int target)
    {
        if (present>target){
            return;
        }
        System.out.print(present+" ");
        for (int i = 0; i <10; i++) {
            if (present==0 && i==0){
                continue;
            }
            lexonum(present*10+i,target);
        }
    }
}
