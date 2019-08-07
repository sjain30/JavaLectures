package com.company;

import java.util.Scanner;

public class SortPrintingtring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        frequency(str);
    }

    public static void frequency(String st)
    {
        int freq[] = new int[26];
        for (int i = 0; i <st.length(); i++) {
            freq[st.charAt(i)-'a']++;
        }
        for (int i = 0; i <freq.length; i++) {
            while (freq[i]>0) {
                System.out.print((char) (i + 'a'));
                freq[i]--;
            }
        }
    }
}
