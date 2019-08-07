package com.company.Lec10;


public class Lexopermute {
    public static void main(String[] args) {
        String str = "bca";
        int freq[] = frequency(str);
        lexo("",freq,str.length());
    }

    public static int[] frequency(String s){
        int ar[]=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            ar[ch-'a']++;
        }
        return ar;
    }

    public static void lexo(String processed,int[] freq,int length)
    {
        if (length==0){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i <freq.length; i++) {
            if (freq[i]>0){
                freq[i]--;
                lexo(processed+(char)(i+'a'),freq,length-1);
                freq[i]++;
            }
        }
    }
}
