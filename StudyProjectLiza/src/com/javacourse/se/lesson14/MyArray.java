package com.javacourse.se.lesson14;

/**
 * Created by elizavetaskomorohova on 01.02.18.
 */
public class MyArray {
    int[] array = new int[3];
    Candy[] box = new Candy[5];
    public  void foo(){
        Candy candy = new Candy();
        box[0] = candy;
        System.out.println(box[0]);

    }
}
