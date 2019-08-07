package com.company.Lec21;

public class HeapClient {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.add(18);
        heap.add(40);
        heap.add(12);
        heap.add(31);
        heap.add(41);
        heap.display();
//        System.out.println(heap.parent(4));
        System.out.println();
        System.out.println(heap.delete());
        System.out.println(heap.delete());
        System.out.println(heap.delete());
        System.out.println(heap.delete());
        System.out.println(heap.delete());

//        heap.delete();
//        heap.delete();
//        heap.delete();
//        heap.delete();
//        heap.delete();

        heap.display();

    }
}
