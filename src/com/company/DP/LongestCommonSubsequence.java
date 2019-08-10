package com.company.DP;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(lcs("aba","abca"));
    }

    public static int lcs(String str1, String str2 )
    {
        if (str1.isEmpty() || str2.isEmpty()){
            return 0;
        }
        int count;
        if (str1.charAt(str1.length()-1)==str2.charAt(str2.length()-1)){
            count=1+lcs(str1.substring(0,str1.length()-1),str2.substring(0,str2.length()-1));
        }
        else {
            count= Math.max(lcs(str1.substring(0,str1.length()-1),str2),lcs(str1,str2.substring(0,str2.length()-1)));
        }
        return count;
    }
}
