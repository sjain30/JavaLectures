package com.company.Lec20;

public class MapClient {
    public static void main(String[] args) {
//        MapsUsingLL map = new MapsUsingLL();
//        map.put("apple","keeps the doctor away");
//        map.put("mango","king of fruits");
//        System.out.println(map.get("mango"));
////        map.display();
////        map.remove("apple");
//        System.out.println(map.get("apple").hashCode());
//        System.out.println(map.toString());

        MapUsingArray mapa = new MapUsingArray();
        mapa.put("Spaghetti","Best" );
        mapa.put("Pizza", "Joey");
//        mapa.remove("Spaghetti");
        System.out.println(mapa.get("Spaghetti"));
        System.out.println(mapa.toString());
    }
}
