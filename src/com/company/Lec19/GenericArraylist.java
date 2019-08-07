package com.company.Lec19;

public class GenericArraylist<T> {
    private T data[];
    private int DefaultSize=10;
    private int size =0;

    public GenericArraylist() {
        this.data = (T[]) new Object[DefaultSize];
    }
    //    public Arraylist()
//    {
//        this.data = new int[DefaultSize];
//    }

//    public Arraylist(int len)
//    {
//        DefaultSize=len;
//        this.data = new int[DefaultSize];
//    }

    public void add(T item)
    {
        if (isFull()){
//            resize();
            return;
        }
        data[size++]=item;
    }

//    private void resize() {
//        int temp[]= new int[data.length*2];
//        for (int i = 0; i <data.length; i++) {
//            temp[i]=data[i];
//        }
//        data=temp;
//    }

    private boolean isFull() {
        return size==DefaultSize;
    }

    public void remove()
    {
        size--;
    }

    public T get(int index)
    {
        return data[index];
    }

    public void set(int index, T ele) throws Exception {
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
