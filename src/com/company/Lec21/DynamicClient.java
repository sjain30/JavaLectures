package com.company.Lec21;

public class DynamicClient {
    public static void main(String[] args) {
        DynamicMapAL map = new DynamicMapAL();
        for (int i = 0; i <5 ; i++) {
            map.put(i,i+100);
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(map.get(i));
        }
        for (int i = 5; i <10 ; i++) {
            map.put(i,i+100);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(map.get(i));
        }
    }
}
