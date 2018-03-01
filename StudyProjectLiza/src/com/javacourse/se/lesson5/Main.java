package com.javacourse.se.lesson5;


import com.javacourse.se.Liza.Vector;

/**
 * Created by elizavetaskomorohova on 31.01.18.
 */
public class Main {
    public static void main(String arg[]) {
        Vector vec = new Vector(1, 2);
        Vector test = new Vector(2,2);
        vec.printRes();
        test.printRes();
        vec.multiplyOnDigit(2);
        System.out.print("new coord:  ");
        vec.printRes();
        Vector v = vec.multiply(test);
        System.out.print("new res:  ");
        v.printRes();

    }
}