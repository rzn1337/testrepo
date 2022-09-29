import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*UPC codes. The Universal Product Code (UPC) is a 12 digit code that uniquely specifies a product.
        The least significant digit d1(rightmost one) is a check digit which is the uniquely determined by making the following expression a multiple of 10:
(d1 + d3 + d5 + d7 + d9 + d11) + 3 (d2 + d4 + d6 + d8 + d10 + d12)
As an example, the check digit corresponding to 0-48500-00102 (Tropicana Pure Premium Orange Juice) is 8 since

(8 + 0 + 0 + 0 + 5 + 4) + 3 (2 + 1 + 0 + 0 + 8 + 0) = 50
and 50 is a multiple of 10. Write a program that reads in a 11 digit integer from a command line parameter, computes the check digit, and prints the the full UPC. Hint: use a variable of type long to store the 11 digit number.*/


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 11 Digits: ");
        long x = input.nextLong();

        int d1 = 0;
        long y;

        long d2 = x % 10;
        long d3 = (x % 100) / 10;
        long d4 = (x % 1000) / 100;
        long d5 = (x % 10000) / 1000;
        long d6 = (x % 100000) / 10000;
        long d7 = (x % 1000000) / 100000;
        long d8 = (x % 10000000) / 1000000;
        long d9 = (x % 100000000) / 10000000;
        long d10 = (x % 1000000000) / 100000000;
        long d11 = (x % 10000000000L) / 1000000000;
        long d12 = (x % 100000000000L) / 10000000000L;

            for ( d1 = 0; d1 <= 9; d1++) {
                    y = ((d1 + d3 + d5 + d7 + d9 + d11) + (3 * (d2 + d4 + d6 + d8 + d10 + d12))) % 10;
                    if (y==0) {
                        break;
                    }
            }

        System.out.printf("UPC: %d%d%d%d%d%d%d%d%d%d%d%d",d12,d11,d10,d9,d8,d7,d6,d5,d4,d3,d2,d1);
















    }

}