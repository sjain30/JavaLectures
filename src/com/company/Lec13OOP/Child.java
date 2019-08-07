package com.company.Lec13OOP;

public class Child {
    public static void main(String[] args) {
        Human h = new Human();
        h.name="Sajal";
        System.out.println(h.name);
        System.out.println(h.balance);
        h.loan();
        h.loan();
        h.loan();
        h.loan();
        h.loan();

        Human arvind = new Human();
        arvind.name="Arvind";
        Human.fest();
        System.out.println(arvind.name);
        System.out.println(h.name);
        System.out.println(arvind.balance);
    }
}
