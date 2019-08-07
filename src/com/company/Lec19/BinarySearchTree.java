package com.company.Lec19;


public class BinarySearchTree {

    private Node root;

    private class Node
    {
        private Node left;
        private Node right;
        private int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(int n)
    {
        this.root = populate(root,n);
    }

    private Node populate(Node node, int value) {
        if (node==null){
            return new Node(value);
        }

        if (value<node.value){
            node.left=populate(node.left,value);
        }
        else{
            node.right=populate(node.right,value);
        }
        return node;
    }

    public void display() {
        display(root,"","root");
    }

    public void display(Node node, String indent, String msg)
    {
        if (node==null){
            return;
        }
        System.out.println(indent+node.value+msg);
        display(node.left,indent+"\t","left");
        display(node.right,indent+"\t","right");
    }

    public Node findnode(int item)
    {
        return findnode(root,item);
    }

    private Node findnode(Node node, int item) {
        if (node==null){
            return null;
        }
        if (node.value==item){
            return node;
        }
        if (item<node.value){
            return findnode(node.left,item);
        }
        else {
            return findnode(node.right, item);
        }
    }

    public int successor(int target)
    {
        return successor(findnode(target));
    }

    private int successor(Node node) {
        if (node==null){
            return -1;
        }
        if (node.right!=null){
            Node current=node.right;
            while (current.left!=null){
                current=current.left;
            }
            return current.value;
        }
        int succ=0;
        if (node.value<root.value){
            succ=successor(root.left);
        }
        else {
            succ=successor(root.right);
        }
        return succ;
    }
}
