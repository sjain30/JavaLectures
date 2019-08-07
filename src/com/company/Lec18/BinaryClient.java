package com.company.Lec18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryClient {
    public static void main(String[] args) throws FileNotFoundException {
        BinaryTree tree = new BinaryTree();
//        Scanner scan = new Scanner(System.in);
        File file = new File("D:\\Java Coding Blocks\\Lectures\\src\\com\\company\\Lec18\\Input");
        Scanner scan = new Scanner(file);
        tree.populate(scan);
        tree.populate(scan);
        tree.populate(scan);
        tree.populate(scan);
//        tree.populate(scan);
        tree.display();
        System.out.println("Height : "+ tree.height());
        tree.diameter();
        System.out.println(tree.find(20));
        tree.mirror();
        tree.display();
    }
}
