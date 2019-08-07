package com.company.Lec9;

import com.company.palindrome;

public class StringSubSeq {
    public static void main(String[] args) {
        String str = "abc";
        subsequence("",str);
        System.out.println(palindrome.palondrome("abcba"));
    }

    public static void subsequence(String processed, String unprocessed)
    {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subsequence(processed+ch,unprocessed);
        subsequence(processed,unprocessed);
    }
}
