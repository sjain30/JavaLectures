package com.company.Lec14;

public class CirQueueClie {
    public static void main(String[] args) throws Exception {
        CircularQueue que = new CircularQueue();
        for (int i = 0; i <10; i++) {
            que.enqueue(i);
        }
        que.display();
        que.dequeue();
        que.dequeue();
        que.display();
        que.enqueue(10);
        que.display();
    }
}
