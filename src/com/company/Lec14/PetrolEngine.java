package com.company.Lec14;

public class PetrolEngine extends Engine{

    int accspeed=7;
//    @Override
    public  void start(){
        System.out.println("I start as a petrol enigne");
    }

    public int accessspeed()
    {
        return super.accspeed;
    }

    public void Noise()
    {
        System.out.println("Hur hur karta hun");
    }

//    @Override
    public void handbrake() {
        System.out.println("Pull handbrakes");
    }

    public void accelerate(){
        System.out.println("I accelerate as a petrol engine");
//        super.accelerate();
    }

    public static void horn()
    {
        System.out.println("Blow Petrol Horn");
    }
}
