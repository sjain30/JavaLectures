package com.company.Lec17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {

    private Node root;

    private class Node
    {
        private int data;
        private ArrayList<Node> children;

        public Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public void populate(Scanner scan)
    {
        System.out.println("Enter the value of root");
        this.root= new Node(scan.nextInt());
        populate(scan,root);
    }
    public void populate(Scanner scan, Node node)
    {
        while (true){
            System.out.println("Do you want to add child of node "+node.data);
            boolean ans = scan.nextBoolean();
            if (ans){
                System.out.println("Enter thr value of child");
                int value = scan.nextInt();
                Node child = new Node(value);
                node.children.add(child);
                populate(scan,child);
            }
            else {
                break;
            }
        }
    }

    public void display() {
        System.out.println(root.data);
        for (Node temp : root.children) {
            display(temp, "   ");
        }
    }

    public void display(Node node, String indent)
    {
        System.out.println(indent+node.data);
        for (Node temp : node.children){
            display(temp,indent+"   ");
        }
    }

    public void postorder() {
        for (Node temp : root.children) {
            postorder(temp, "   ");
        }
        System.out.println(root.data);
    }

    public void postorder(Node node, String indent)
    {

        for (Node temp : node.children){
            postorder(temp,indent+"   ");
        }
        System.out.println(indent+node.data);
    }

    public Node getroot()
    {
        return root;
    }

    public void countnode(){
        System.out.println("Count : "+countnode(getroot()));
    }

    public int countnode(Node node)
    {
        int count=1;
        for (Node temp : node.children){
            count+=countnode(temp);
        }
        return count;
    }

    public int maxdata()
    {
        int max = root.data;
//        for (int i = 0; i <root.children.size(); i++) {
//            max=maxdata(root.children.get(i),max);
//        }
//        return max;
        return maxdata(root,max);
    }

    public int maxdata(Node node, int max)
    {
        if (node.data>max){
            max=node.data;
        }
        for (int i = 0; i <node.children.size(); i++) {
            max=maxdata(node.children.get(i),max);
        }
        return max;
    }

    public int findheight()
    {
        if (root==null){
            return 0;
        }
        int height=1;
        if (!root.children.isEmpty()) {
            height =1;
            for (Node temp : root.children) {
                int ans=findheight(temp,2);
                if (ans>height){
                    height=ans;
                }
            }
        }
        return height;
    }

    public int findheight(Node node, int height)
    {
        if (node.children.isEmpty()){
            return height;
        }
        int h=height;
        for (Node temp : node.children) {
                int ans=findheight(temp,height+1);
                if (ans>h){
                    h=ans;
                }
            }
        return h;
    }

    public int findDepth(int item)
    {
        if (item==root.data){
            return 0;
        }
        int dep =-1;
        for (int i = 0; i <root.children.size(); i++) {
            dep= findDepth(root.children.get(i),item,1);
            if (dep!=-1){
                break;
            }
        }
        return dep;
    }

    public int findDepth(Node node, int item, int dep)
    {
        if (node.data==item){
            return dep;
        }
        if (node.children.isEmpty()){
            return -1;
        }
        int ans = -1;
        for (int i = 0; i <node.children.size(); i++) {
            ans= findDepth(node.children.get(i),item,dep+1);
            if (ans!=-1){
                break;
            }
        }
        return ans;
    }

    public void levelorder()
    {
        levelorder(root);
    }

    private void levelorder(Node node) {
        Queue<Node>que = new LinkedList();
        que.add(node);
        while (!que.isEmpty()){
            Node front = que.remove();
            System.out.print(front.data+" ");
            for (int i = 0; i <front.children.size(); i++) {
                que.add(front.children.get(i));
            }
        }
    }


}
