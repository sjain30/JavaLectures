package com.company;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str);
        System.out.println(palondrome(str));
    }

    public static boolean palondrome(String st)
    {
        for (int i = 0; i <st.length()/2; i++) {
            if (st.charAt(i)!=st.charAt(st.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
