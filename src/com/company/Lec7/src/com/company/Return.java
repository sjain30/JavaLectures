package com.company;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(difference(str));
    }

//    public static StringBuilder difference(String st)             Rishabh's ghatiya logic
//    {
//        StringBuilder builder = new StringBuilder(st);
//        int size=2*st.length()-3;
//        for (int i = 0; i <size; i+=2) {
//            char ch1= builder.charAt(i);
//            char ch2= builder.charAt(i+1);
//            int diff=Math.abs(ch1-ch2);
//            builder.insert(i+1,diff);
//            if(diff>=10){
//                i++;
//                size++;
//            }
//        }
//        return builder;
//    }

    public static StringBuilder difference(String st)
    {
        StringBuilder builder = new StringBuilder();
        builder.append(st.charAt(0));
        for (int i = 0; i <st.length()-1; i++) {
            char ch1= st.charAt(i);
            char ch2= st.charAt(i+1);
            int diff=ch2-ch1;
            builder.append(diff);
            builder.append(st.charAt(i+1));
        }
        return builder;
    }
}
