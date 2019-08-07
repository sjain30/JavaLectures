package com.company.Lec10;

public class Skiphi {
    public static void main(String[] args) {
        String str = "hitman hihitchar";
//        String str = "hihithi";
        skiphi("",str);
    }

    public static void skiphi(String processed, String unprocessed)
    {
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        if (unprocessed.startsWith("hi")) {
            if (unprocessed.startsWith("hit")) {
                skiphi(processed + "hit", unprocessed.substring(3));
            }
            else {
                skiphi(processed,unprocessed.substring(2));
            }
        }
        else {
            skiphi(processed+unprocessed.charAt(0),unprocessed.substring(1));
        }
    }
}
