package com.company.Lec17;

public class listclient {
    public static void main(String[] args) {
        LinkedLists17 list1 = new LinkedLists17();
        LinkedLists17 list2 = new LinkedLists17();
        for (int i = 0; i <5; i+=2) {
            list1.insertlast(i);
        }
        list1.display();
        for (int i = 1; i <6; i+=2) {
            list2.insertlast(i);
        }
        list2.display();
        LinkedLists17 list3 = LinkedLists17.merging(list1,list2);
        list3.display();
        LinkedLists17 list4 = new LinkedLists17();
        list4.insertlast(1);
        list4.insertlast(1);
        list4.insertlast(2);
        list4.insertlast(2);
        list4.insertlast(3);
        list4.insertlast(4);
        list4.insertlast(5);
        list4.insertlast(5);
        list4.display();
        list4.deleteduplicate();
        list4.display();
    }
}
