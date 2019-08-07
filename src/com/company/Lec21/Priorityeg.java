package com.company.Lec21;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Priorityeg {
    public static void main(String[] args) {
        PriorityQueue<Human> priority = new PriorityQueue();
        Human om = new Human(19,"Om");
        Human Manish = new Human(11,"manish");
        Human Areeb = new Human(18,"Areeb");
        Human Guru = new Human(20,"Guru");
        priority.add(om);
        priority.add(Manish);
        priority.add(Areeb);
        priority.add(Guru);
        System.out.println(priority.remove());
    }
}
