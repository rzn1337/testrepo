import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Three-sort. Write a program ThreeSort.java that takes three int values from the command line and prints them in ascending order. Use Math.min() and Math.max().
         */

        Scanner input = new Scanner(System.in);

        int x, y, z;
        int highest = Integer.MIN_VALUE;
        int mid = 0;
        int lowest = Integer.MAX_VALUE;

        System.out.print("Enter the first number: ");
        x = input.nextInt();

        System.out.print("Enter the second number: ");
        y = input.nextInt();

        System.out.print("Enter the third number: ");
        z = input.nextInt();

        int a = Math.max(x, y);
        int b = Math.max(y, z);
        int c = Math.max(x, z);
        int d = Math.min(x, y);
        int e = Math.min(y, z);
        int f = Math.min(x, z);

        if (a==b) {
            highest = a;
            mid = c;
        } else if (b==c) {
            highest = b;
            mid = a;
        } else if (a==c) {
            highest = c;
            mid = b;
        }

        if (d==e) {
            lowest = d;
        } else if (e==f) {
            lowest = e;
        } else if (d==f) {
            lowest = f;
        }



        System.out.printf("%d, %d, %d", highest, mid, lowest);

    }




    }
