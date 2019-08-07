package com.company.Lec14;

public class QueueClie {
    public static void main(String[] args) throws Exception {
        Queue que = new Queue();
        for (int i = 0; i <10; i++) {
            que.enqueue(i);
            que.display();
            System.out.println();
        }
        for (int i = 0; i <10; i++) {
            que.dequeue();
            que.display();
            System.out.println();
        }
    }
}
