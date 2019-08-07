package com.company;

public class Main {

    public static void main(String[] args) {
	StringBuilder builder = new StringBuilder("abcdefghij");
	builder.delete(2,7);
        System.out.println(builder);
    }
}
