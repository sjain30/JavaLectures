package com.company.Lec20;

public class MapALClient {
    public static void main(String[] args) {
        MapAL map = new MapAL();
        map.put("apple","1");
        map.put("orange","2");
        System.out.println(map.get("orange"));
    }
}
