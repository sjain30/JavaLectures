package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        for (int i = 0; i <3; i++) {
            list.add(i);
        }
        list.remove(0);
        list.add(1,2);
        list.add("hello");
        System.out.println(list);
        System.out.println(list.get(3));
        list.set(1,5);
        //list.clone();
        System.out.println(list);
//        ArrayList list2 = (ArrayList)list.clone();
//        Collections.sort(list2);
        //list2.sort(null);
//        System.out.println(list2);
    }
}
