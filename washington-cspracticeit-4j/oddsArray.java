import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { 

        /* Write code that creates an array named odds and stores all odd numbers between -6 and 38 into it using a for loop. 
        Make the array's size exactly large enough to store the numbers. Print odds*/
        int a = -6;
        int[] odds = new int[21];
        for (int i = 0; i < odds.length; i++) {
            if (a%2 == 0) {
                odds[i] = a+1;
            }
            if (a%2 != 0) {
                i--;
            }
            a++;
        }
        for (int x : odds) {
            System.out.println(x);
        }
    }
}
