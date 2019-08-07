package com.company;

public class LearnRec {
    public static void main(String[] args) {
        System.out.println("Chaliye shuru karte hain bina kisi bakchodi ke");
        pd(4);
    }

    public static void pd(int n)
    {
        if (n==0){
            return;
        }
        System.out.println(n);
        pd(n-1);
        System.out.println(n);
    }
//
//    public static void pd4(){
//        System.out.println("Aa rha hun no.4");
//        pd3();
//        System.out.println("jaa rha hun no,4");
//    }
//    public static void pd3(){
//        System.out.println("Aa rha hun no.3");
//        pd2();
//        System.out.println("jaa rha hun no,3");
//    }
//    public static void pd2(){
//        System.out.println("Aa rha hun no.2");
//        pd1();
//        System.out.println("jaa rha hun no,2");
//    }
//    public static void pd1(){
//        System.out.println("Aa rha hun no.1");
//    }
}
