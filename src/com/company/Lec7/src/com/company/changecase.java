package com.company;

import java.util.Scanner;

public class changecase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(s.next());
        //builder.append(s.next());
        change(builder);
        System.out.println(builder.toString());
    }

    public static void change(StringBuilder str1)
    {
        for (int i = 0; i <str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch>='A' && ch<='Z'){
                ch=(char)((ch-'A')+'a');
            }
            else if (ch>='a' && ch<='z'){
                ch=(char)((ch-'a')+'A');
            }
            str1.setCharAt(i,ch);
        }
    }
}
