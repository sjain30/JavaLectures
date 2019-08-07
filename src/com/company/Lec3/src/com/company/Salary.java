package com.company;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sal=s.nextInt();
        if(sal>=5000){
            sal+=5000;
        }
        else {
            sal+=3000;
        }
        System.out.println(sal);
    }
}
