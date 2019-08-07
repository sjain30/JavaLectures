package com.company.Lec15;

public class ArrayClient {
    public static void main(String[] args) {
        Arraylist<Number> list = new Arraylist<Number>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.display();
        for (int i = 0; i <50; i++) {
            list.add(i);
        }
        System.out.println();
        list.display();
    }
}
