package com.company.Lec14;

public class CircularQueue {

    private int data[];
    private int DefaultSize;
    private int end;
    private int front;

    public CircularQueue(){
        this.DefaultSize=10;
        this.data= new int[DefaultSize];
        this.end=-1;
        this.front=-1;
    }

    public void enqueue(int item) throws Exception
    {
     if ((front==0 && end==DefaultSize-1)||(front==end+11)){
         throw new Exception("Bhar gayi");
     }
     if (front==-1){
         front=0;
     }
     if(end==DefaultSize-1){
         end=-1;
     }
     data[++end]=item;
    }

    public int dequeue() throws Exception
    {
     if (front==-1){
         throw new Exception("Khaali hain");
     }
     int temp;
     if(front==end){
         temp=data[front];
         data[front]=-1;
         front=end=-1;
     }
     else {
         temp = data[front];
         data[front]=-1;
         front++;
     }
     return temp;
    }

    public int front() throws Exception
    {
        if ((front==-1)){
            throw new Exception("Khaali hain");
        }
        return data[front];
    }

    public void display()
    {
        if (front>end) {
            for (int i = front; i <= DefaultSize - 1; i++) {
                System.out.print(data[i] + " ");
            }
            for (int i = 0; i <= end; i++) {
                System.out.print(data[i] + " ");
            }
        }
        else {
            for (int i = front; i <=end ; i++) {
                System.out.print(data[i] + " ");
            }
        }
//        for (int i = 0; i <DefaultSize; i++) {
//            System.out.print(data[i] + " ");
//        }
        System.out.println();
    }


}
