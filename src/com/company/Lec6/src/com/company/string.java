package com.company;

public class string {
    public static void main(String[] args) {
        String line = "Hello";
        String s = "Hello";
        subs(s,0,1);
//        StringBuilder builder = new StringBuilder(s);
        //line= s+line;
//        System.out.println(line.equals(s));
//        for (int i = 0; i <line.length(); i++) {
//            for (int j = i+1; j <=line.length() ; j++) {
//                System.out.println(line.substring(i,j));
//            }
//
//        }
//        System.out.println(s.startsWith("He"));
//        char ch='l';
//        int si=0;
//        while (true){
//            int loc=s.indexOf(ch,si);
//            if (loc==-1){
//                break;
//            }
//            System.out.println(loc);
//            si=loc+1;
//        }
    }

    public static void subs(String str, int i,int j)
    {
        if (i==str.length()){
            return;
        }
        System.out.println(str.substring(i,j));
        if (j==str.length()){
            subs(str,i+1,i+2);
            return;
        }
        subs(str,i,j+1);
    }
}
