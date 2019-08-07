package com.company.Lec16;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedLists list =new LinkedLists();
        list.insertfirst(2);
        list.insertfirst(1);
//        list.insertfirst(15);
        list.insertlast(3);
        list.insertlast(4);
        list.insertlast(5);
        list.display();
//        list.deletefirst();
//        list.display();
//        list.deletefirst();
//        list.deletefirst();
//        list.deletefirst();
//        list.deletefirst();
//        list.deletelast();
//        list.display();
//        list.insertmid(13,1);
//        list.display();
        list.deletelast();
        list.display();
        list.findmid();
        list.deleteatany(1);
        list.display();
        list.reverse(list.head);
        list.display();
    }
}
