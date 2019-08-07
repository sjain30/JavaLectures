package com.company.Lec19;

public class GenericBSTClient {
    public static void main(String[] args) {
        GenericBST gbst = new GenericBST();
        gbst.populate(21);
        gbst.populate(10);
        gbst.populate(5);
        gbst.populate(7);
        gbst.populate(35);
        gbst.populate(32);
        gbst.populate(31);
        gbst.populate(34);
        gbst.display();
        System.out.println(gbst.successor(34));
        gbst.inrange(10,34);

    }
}
