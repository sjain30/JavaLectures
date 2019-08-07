package com.company.Lec14;

import sun.invoke.empty.Empty;

public class Queue {

    private int data[];
    private int DefaultSize;
    private int end;

    public Queue(){
        this.DefaultSize=10;
        this.data= new int[DefaultSize];
        this.end=-1;
    }

    public void enqueue(int item) throws Exception
    {
     if (isFull()){
         throw new Exception("Bhar gayi");
     }
//        System.out.println(end);
     data[++end]=item;
    }

    private boolean isFull() {
        return end==data.length-1;
    }


    public int dequeue() throws Exception
    {
     if (end==-1){
         throw new Exception("Khaali hain");
     }
     else if (end==0){
         System.out.println("Empty");
     }
     int temp=data[0];
//        System.out.println(end);
     for (int i = 1; i <=end; i++) {
            data[i-1]=data[i];
        }
        end--;
     return temp;
    }

    public int front() throws Exception
    {
        if ((end==-1)){
            throw new Exception("Khaali hain");
        }
        return data[0];
    }

    public void display()
    {
        for (int i = 0; i <=end; i++) {
            System.out.print(data[i]+" ");
        }
    }


}
