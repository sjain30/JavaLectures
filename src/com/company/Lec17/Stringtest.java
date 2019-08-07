package com.company.Lec17;

public class Stringtest {
    public static void main(String[] args) {
        String str="abcd";
        permutation("",str);
        System.out.println("Subsequences: ");
        subsequence("",str);
    }

    public static void subsequence(String processed, String unprocessed)
    {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        subsequence(processed+ch,unprocessed.substring(1));
        subsequence(processed,unprocessed.substring(1));
    }

    public static void permutation(String processed, String unprocessed)
    {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch =unprocessed.charAt(0);
        for (int i = 0; i <=processed.length(); i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);
            permutation(first+ch+second,unprocessed.substring(1));

            }
    }
}
