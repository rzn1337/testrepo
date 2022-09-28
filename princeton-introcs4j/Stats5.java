import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Uniform random numbers. Write a program Stats5.java that prints five uniform random values between 0 and 1,
        their average value, and their minimum and maximum value.
         Use Math.random(), Math.min(), and Math.max().*/

        double a, b, c, d, e, f, g, h, v, w, x, y, z, avg;

        v = Math.random();
        w = Math.random();
        x = Math.random();
        y = Math.random();
        z = Math.random();

        avg = (v+w+x+y+z)/5;

        a = Math.max(w,x);
        b = Math.max(y,z);
        c = Math.max(a,b);
        d = Math.max(v,c);
        e = Math.min(w,x);
        f = Math.min(y,z);
        g = Math.min(e,f);
        h = Math.min(v,g);

        System.out.printf("Max = %f", d);
        System.out.println();
        System.out.printf("Min = %f", h);
        System.out.println();
        System.out.printf("Average = %f ", avg);









    }
}