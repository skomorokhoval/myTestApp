package com.javacourse.se.Liza;

/**
 * Created by elizavetaskomorohova on 08.02.18.
 */
public class Vector {
    public int x;
    public int y;
    public int lenght;
    public void multiplyOnDigit(int digit){
       x = x * digit;
       y = y * digit;
       lenght = x + y;
    }
    public void printRes()
    {
        System.out.print("x = " +x + " ");
        System.out.print("y = " +y+ " ");
        System.out.print("lenght " +lenght + " ");
    }
    public Vector (int x1,int y1){
        x = x1;
        y = y1;
        lenght = x+y;
    }
    public Vector multiply(Vector another){
        Vector name = new Vector(x * another.x, y *another.y);
        return name;
    }

}
