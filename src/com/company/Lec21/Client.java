package com.company.Lec21;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Human om = new Human(19,"Om");
        Human Manish = new Human(11,"manish");
        Human Areeb = new Human(18,"Areeb");
        Human Guru = new Human(20,"Guru");
        Human arr[] = {om,Manish,Areeb,Guru};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
