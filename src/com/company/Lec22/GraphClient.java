package com.company.Lec22;

public class GraphClient {
    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.AddEdge("A","B");
//        list.AddEdge("A","C");
//        list.AddEdge("D","C");
//        list.display();
//        list.breadthfirst();
//        System.out.println(list.bfSearch("A"));
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
//        list.add('E');
//        list.add('D');
        list.AddEdge('A','B');
        list.AddEdge('A','D');
        list.AddEdge('C','B');
//        list.AddEdge('C','D');
//        list.AddEdge('D','E');
//        list.AddEdge('B','C');
//        list.AddEdge('B','D');
        list.display();
//        list.levelorder();
        System.out.println(list.bipartite());
        list.DFT();
    }
}
