package com.company.Lec15;

public class Arraylist<I extends Number> {
    private int data[];
    private int DefaultSize;
    private int size =0;
    public Arraylist()
    {
        DefaultSize=10;
        this.data = new int[DefaultSize];
    }

    public Arraylist(int len)
    {
        DefaultSize=len;
        this.data = new int[DefaultSize];
    }

    public void add(int item)
    {
        if (isFull()){
            resize();
        }
        data[size++]=item;
    }

    private void resize() {
        new Arraylist<Number>(data.length*2);
//        int temp[]= new int[data.length*2];
//        for (int i = 0; i <data.length; i++) {
//            temp[i]=data[i];
//        }
//        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public void remove()
    {
        size--;
    }

    public int get(int index)
    {
        return data[index];
    }

    public void set(int index, int ele) throws Exception {
        if (index>size){
            throw new Exception("Index not reachable");
        }
        data[index]=ele;
    }

    public void display()
    {
        for (int i = 0; i <size; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
