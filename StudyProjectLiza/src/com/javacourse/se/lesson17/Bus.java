package com.javacourse.se.lesson17;

/**
 * Created by elizavetaskomorohova on 07.02.18.
 */
public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "AD45F";
    public final int SERIAL_NUMBER2 = 123;
    public void go(){
       System.out.println("GO");
    }
    public void  showKm(int km){
System.out.println(km);

    }
}
