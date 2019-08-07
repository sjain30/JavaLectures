package com.company.Lec10;

import java.util.*;
public class ReplacePi {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            String str = scan.next();
            System.out.println(pipi("",str));
            t--;
        }
    }

    public static String pipi(String processed, String unprocessed){
        if (unprocessed.length()<2){
            return processed+unprocessed;
        }
        char ch= unprocessed.charAt(0);
        if (ch=='p' && unprocessed.charAt(1)=='i'){
            return pipi(processed+"3.14",unprocessed.substring(2));
        }
        else {
            return pipi(processed+ch,unprocessed.substring(1));
        }
    }
}