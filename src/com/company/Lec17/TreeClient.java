package com.company.Lec17;

import java.util.Scanner;

public class TreeClient {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner("1 true 2 true 3 true 11 false false true 4 true 9 true 10 false false false true 6 true 7 false true 8 false false false true 5 false false");
//        Scanner scan = new Scanner("1 true 2 false true 3 false false");
        GenericTree tree = new GenericTree();
        tree.populate(scan);
        System.out.println("Pre Order: ");
        tree.display();
        System.out.println();
//        System.out.println("Post Order: ");
//        tree.postorder();
//        System.out.println("Count : "+tree.countnode(tree.getroot()));
        tree.countnode();
        System.out.println("Node with largest data : "+tree.maxdata());
        System.out.println("Height of tree : "+tree.findheight());
        System.out.println("Depth : "+tree.findDepth(5));
        tree.levelorder();
    }
}
