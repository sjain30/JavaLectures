package com.company.Lec14;

public class Engine {

    int accspeed=2;
    public void start(){
        System.out.println("I start as a generic engine");
    }

    public void stop(){
        System.out.println("I stop as a generic engine");
    }

    public void accelerate(){
        System.out.println("I accelerate as a generic engine");
    }

    public void accelerate(int speed){
        System.out.println("I accelerate as a generic engine of "+speed);
    }

//    public abstract void handbrake();

    public static void horn()
    {
        System.out.println("Blow Generic Horn");
    }
}
