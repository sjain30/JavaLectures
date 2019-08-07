package com.company.Lec18;

import java.util.Scanner;

public class BinaryTree {

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

    public void populate(Scanner scan)
    {
        this.root = populate(root,scan);
    }

    private Node populate(Node node, Scanner scan) {
        if (node==null){
            System.out.println("Enter the value of root : ");
            int n = Integer.parseInt(scan.nextLine());
            return new Node(n);
        }
        System.out.println("Enter direction : ");
        String dir = scan.nextLine();
        if (dir.equals("left")){
            node.left=populate(node.left,scan);
        }
        else {
            node.right=populate(node.right,scan);
        }
        return node;
    }

    public void display() {
        display(root,"    ","root");
    }

    public void display(Node node, String indent, String msg)
    {
        if (node==null){
            return;
        }
        System.out.println(indent+node.value+msg);
        display(node.left,indent+"    ","left");
        display(node.right,indent+"    ","right");
    }

    public int height()
    {
        return height(root);
    }

    private int height(Node node) {
        if (node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }

    public void diameter()
    {
        int dia=diameter(root);
        System.out.println("Diameter : "+dia);
    }

    private int diameter(Node node) {
        if (node==null){
            return 0;
        }
        int current=1+height(node.left)+height(node.right);
        int max= Math.max(diameter(node.left),diameter(node.right));
        return Math.max(max,current);
    }

    public boolean find(int target)
    {
        return find(root,target);
    }

    private boolean find(Node node, int target) {
        if (node==null){
            return false;
        }
        return node.value==target || find(node.left,target) || find(node.right,target);
    }

    public void mirror()
    {
        mirror(root);
    }

    private void mirror(Node node) {
        if (node==null){
            return ;
        }
        mirror(node.left);
        mirror(node.right);
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
    }
}
