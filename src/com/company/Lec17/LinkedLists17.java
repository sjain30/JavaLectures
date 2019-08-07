package com.company.Lec17;

import com.company.Lec16.LinkedLists;

public class LinkedLists17 {

    protected Node head;
    private Node tail;
    private int size=0;

    public void display()
    {
        Node node = head;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println("END"+size);

    }

    public void insertfirst(int item)
    {
        Node node = new Node(item);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }

    public void insertlast(int item)
    {
        Node node = new Node(item);
        if(tail==null){
            tail=node;
            head=node;
        }
        else {
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void insertmid(int item, int index){
        if (index==0){
            insertfirst(item);
            return;
        }
        if (index==size){
            insertlast(item);
            return;
        }
        Node prev=getnode(index-1);
        Node node = new Node(item);
        node.next=prev.next;
        prev.next=node;
        size++;
    }

    public Node getnode(int index)
    {
        Node temp=head;
        for (int i = 0; i <index; i++) {
            temp=temp.next;
        }
        return temp;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void deletefirst()
    {
        if (head==null){
            System.out.println("Empty");
            return;
        }
        System.out.println("Deleted Data: "+head.data);
        head=head.next;
        size--;
    }

    public void deletelast(){
        if(size<2){
            deletefirst();
            return;
        }
        Node temp = getnode(size-2);
//        Node temp = head;
//        while (temp.next!=tail){
//            temp=temp.next;
//        }
        System.out.println("Deleted data: "+tail.data);
        temp.next=null;
        tail=temp;
        size--;
    }

    public void deleteatany(int index)
    {
        if (index==0){
            deletefirst();
            return;
        }
        if (index==size-1){
            deletelast();
            return;
        }
        Node prev = getnode(index-1);
        System.out.println("Deleted data: "+prev.next.data);
        prev.next=prev.next.next;
        size--;
    }

    public void findmid()
    {
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Mid Element: "+slow.data);
    }

    public void reverse(Node node)
    {
        if (node==tail){
            head=tail;
            System.out.println("Reversing..");
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

    public static LinkedLists17 merging(LinkedLists17 list1, LinkedLists17 list2)
    {
        Node head1=list1.getnode(0);
        Node head2=list2.getnode(0);
        LinkedLists17 list = new LinkedLists17();
        while (head1!=null && head2!=null){
            if (head1.data<head2.data){
                list.insertlast(head1.data);
                head1=head1.next;
            }
            else {
                list.insertlast(head2.data);
                head2=head2.next;
            }
        }
        while (head1!=null){
            list.insertlast(head1.data);
            head1=head1.next;
        }
        while (head2!=null){
            list.insertlast(head2.data);
            head2=head2.next;
        }
        return list;
    }

    public void deleteduplicate()
    {
        Node temp = this.head;
        while (temp.next!=null ){
            if (temp.data==temp.next.data){
                    temp.next = temp.next.next;
                    size--;
            }
            else {
                temp = temp.next;
            }
        }
        tail=temp;
    }
}
