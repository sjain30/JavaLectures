package com.company.Lec9;

import java.util.Arrays;
import java.util.Scanner;

public class MiscQues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();
        String list[] = str.split(" ");
        System.out.println(Arrays.toString(list));
        int pos=n/10;
        for (int i = 0; i <2; i++) {
            String word = list[pos - 1];
            int len = word.length();
            if (len % 2 == 0) {
                StringBuilder word2 = new StringBuilder(word.substring(0,len/2));
                System.out.print(word.substring(len / 2, len) + word2.reverse() + " ");
            }
            else {
                StringBuilder word2 = new StringBuilder(word.substring(0,(len+1)/2));
                System.out.print(word.substring(len / 2, len) + word2.reverse() + " ");
            }
            pos = n % 10;
        }
    }
}
