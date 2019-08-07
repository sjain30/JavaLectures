package com.company.Lec10;

public class AsciiSubSeq {
    public static void main(String[] args) {
        String str = "abc";
        subsequence("",str);
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
        subsequence(processed+(int)ch,unprocessed);
        subsequence(processed,unprocessed);
    }
}
