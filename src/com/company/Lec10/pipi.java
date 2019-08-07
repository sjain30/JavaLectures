package com.company.Lec10;

public class pipi {
    public static void main(String[] args) {
        String str = "pipipip";
//        pipi("",str,0);
        System.out.println(pipi("",str));
    }

//    public static void pipi(String processed, String unprocessed, int index){     My Logic
//        if (index==unprocessed.length()){
//            System.out.println(processed);
//            return;
//        }
//        if (unprocessed.substring(index).startsWith("pi")){
//            pipi(processed+"3.14",unprocessed,index+=2);
//        }
//        else {
//            pipi(processed+=unprocessed.charAt(index),unprocessed,index+1);
//        }
//    }

    public static String pipi(String processed, String unprocessed){
        if (unprocessed.length()<2){
              return processed+unprocessed;
        }
        char ch= unprocessed.charAt(0);
        if (ch=='p' && unprocessed.charAt(1)=='i'){
            return pipi(processed+"3.14",unprocessed.substring(2));
        }
        else {
            return pipi(processed+ch,unprocessed.substring(1));
        }
    }
}
