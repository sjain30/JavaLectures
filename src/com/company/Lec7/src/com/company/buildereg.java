package com.company;

public class buildereg {
    public static void main(String[] args) {
//        String s ="";
//        for (int i = 0; i <10000; i++) {
//            s+='a';
//        }
//        System.out.println(s);
        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder.toString());
        for (int i = 0; i <10000; i++) {
            builder.append(1);
        }
        System.out.println(builder.toString());
    }
}
