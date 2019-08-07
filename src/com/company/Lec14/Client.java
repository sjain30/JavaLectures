package com.company.Lec14;

public class Client {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();
        engine.start();
        engine.accelerate();
        engine.stop();
        PetrolEngine engine2 = new PetrolEngine();
        engine2.start();
        engine2.accelerate();
        engine2.stop();
        engine2.Noise();
        System.out.println(engine2.accspeed);
        System.out.println(engine2.accessspeed());
        System.out.println(engine.accspeed);    //Variables can't be overloaded
        engine2.accelerate(engine2.accspeed);
        engine2.handbrake();
        engine2.horn();
        engine.horn();                              //Static methods can't be overloaded
        engine.start();
//        sum(5,6,9);
//        Engine engine = new PetrolEngine();   //Possible
//        engine.start();
//        engine.accelerate();
//        engine.stop();
//        engine.Noise();       //Not Possible
    }

    public static void sum(int... ar)
    {
        int sum=0;
        for (int i = 0; i <ar.length; i++) {
            sum+=ar[i];
        }
        System.out.println(sum);
    }
}
