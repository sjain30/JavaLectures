package com.company.Lec15;

public class DynamicCircular extends circularqueue {

    @Override
    public boolean enqueue(int item)
    {
        if (this.isFull()){
            System.out.println("Resizing");
            int temp[] = new int[data.length*2];
            for (int i = 0; i <data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
            this.front=0;
            this.end=size;
        }
        return super.enqueue(item);
    }
}
