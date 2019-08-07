package com.company.Lec13OOP;

import java.net.HttpURLConnection;

public class Human {
    String name;
    int balance;
    final int hands;

    public Human()
    {
        this.balance=10000;
        this.hands=2;
    }

    public Human(int balance)
    {
        this.balance=balance;
        this.hands=11;
    }

    public void bal(int balance){
        this.balance = balance;
    }

    public int loan()
    {
        balance-=(balance/10);
        System.out.println("Gareebi "+balance);
        return balance;
    }

    public Human(Human old)
    {
        this.hands=old.hands;
        this.balance=old.balance;
        this.name=old.name;
  }

    public static void fest() {
        System.out.println("Hurray lawde");
    }
}
