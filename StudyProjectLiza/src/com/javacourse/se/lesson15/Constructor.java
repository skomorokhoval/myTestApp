package com.javacourse.se.lesson15;

/**
 * Created by elizavetaskomorohova on 03.02.18.
 */
public class Constructor {
    public  void foo(){
        Flower flower = new Flower();
        flower.name = "Rose";
        flower.color = "Red";

        Flower flower2= new Flower("Sunflower", "Yellow");
        System.out.println(flower2.color+ " " + flower2.name);
    }
}
