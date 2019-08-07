package com.company.Lec16;

public class LinkedLists {

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
}
