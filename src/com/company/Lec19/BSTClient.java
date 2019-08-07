package com.company.Lec19;

public class BSTClient {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        bst.populate(8);
        bst.populate(4);
        bst.populate(10);
        bst.populate(2);
        bst.populate(20);
        bst.display();
        System.out.println(bst.findnode(2));
        System.out.println(bst.findnode(10));
        System.out.println(bst.successor(2));
    }
}
