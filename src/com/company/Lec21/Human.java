package com.company.Lec21;

public class Human implements Comparable<Human>{

    int age;
    String name;

    public Human(int agr, String name) {
        this.age = agr;
        this.name = name;
    }

    @Override
    public String toString() {
        return age+","+name;
    }

    @Override
    public int compareTo(Human second) {
        return this.age - second.age;
    }
}
