package com.company.Lec19;


public class GenericBST <T extends Comparable<T>>{

    private Node root;

    private class Node
    {
        private Node left;
        private Node right;
        private T value;

        public Node(T value) {
            this.value = value;
        }
    }

    public void populate(T n)
    {
        this.root = populate(root,n);
    }

    private Node populate(Node node, T value) {
        if (node==null){
            return new Node(value);
        }

        if (value.compareTo(node.value)<0){
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

    public Node findnode(T item)
    {
        return findnode(root,item);
    }

    private Node findnode(Node node, T item) {
        if (node==null){
            return null;
        }
        if (node.value.compareTo(item)==0){
            return node;
        }
        if (item.compareTo(node.value)<0){
            return findnode(node.left,item);
        }
        else {
            return findnode(node.right, item);
        }
    }

    public T successor(T target)
    {
        return successor(findnode(target));
    }

    private T successor(Node node) {
        if (node==null){
            return null;
        }
        if (node.right!=null){
            Node current=node.right;
            while (current.left!=null){
                current=current.left;
            }
            return current.value;
        }
        Node succ=null;
        while (root!=null){
            if (node.value.compareTo(root.value)<0){
                succ=root;
                root=root.left;
            }
            else if(node.value.compareTo(root.value)>0){
                root=root.right;
            }
            else {
                break;
            }
        }
        return succ.value;      //Add special case for if there's no successor
//        T succ;
//        if (node.value.compareTo(root.value)<0){
//            succ=successor(root.left);
//        }
//        else {
//            succ=successor(root.right);
//        }
//        return succ;
    }

    public void inrange(T start, T end)
    {
        inrange(root,start,end);
    }

    private void inrange(Node node, T start, T end) {
        if (node==null){
            return;
        }
//        if (node.value.compareTo(start)<0 && node.value.compareTo(end)>0){
//            System.out.println(node.value);
//        }

        if (start.compareTo(node.value)<0){
            inrange(node.left,start,end);
            if (start.compareTo(node.value)<0){
                System.out.println(node.value);
            }
        }
        else {
            inrange(node.right,start,end);
            if (end.compareTo(node.value)>0){
                System.out.println(node.value);
            }
        }

    }
}
