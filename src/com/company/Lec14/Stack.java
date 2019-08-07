package com.company.Lec14;

public class Stack {
    public static int num=1;
    protected int[] data;
    private int DefaultSize;
    private int top;

    public Stack()
    {
        this.DefaultSize=10;
        this.data= new int[DefaultSize];
        this.top=-1;
    }

    public boolean push(int item)
    {
        if (isFull()){
            return false;
        }
        data[++top]=item;
        return true;
    }

    public boolean isFull() {
        return top==data.length;
    }

    public int pop() throws ArrayIndexOutOfBoundsException{
        if (top==-1){
            throw new ArrayIndexOutOfBoundsException("Abhey khaali hain");
        }
        return data[top--];
    }

    public int peak()
    {
        if (top==-1){
            return -1;
        }
        return data[top];
    }
}
