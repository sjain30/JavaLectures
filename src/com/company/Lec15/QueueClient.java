package com.company.Lec15;

import com.company.Lec14.Stack;

public class QueueClient {

    public static void main(String[] args) {

        DynamicCircular q= new DynamicCircular();

        for (int i = 0; i <10 ; i++) {
            q.enqueue(i);
            q.display();
        }
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(14);
//        for (int i = 0; i <8 ; i++) {
//          q.deque();
//            q.display();
//        }

//        q.enqueue(11);
//        q.enqueue(12);
//        q.enqueue(14);
        q.display();
        System.out.println(Stack.num);
    }
}
