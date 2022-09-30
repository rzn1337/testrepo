import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Write a method called zeroDigits that accepts an integer parameter and returns the number of digits in the number that have the value 0.
         For example, the call zeroDigits(5024036) should return 2, and zeroDigits(743) should return 0.
          The call zeroDigits(0) should return 1.
        You may assume that the integer is non-negative. (We suggest you use a do/while loop in your solution.)*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        String str = input.next();

        int zeros = 0;

        int x = str.length();

        for (int i = 0; i < x; i++) {

            if (str.charAt(i)=='0'){
                zeros = zeros + 1;
            }
        }
        System.out.printf("Number of Zeros: %d", zeros);
    }
}