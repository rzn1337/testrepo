import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Write a method called average that computes the average (arithmetic mean) of all elements in an array of integers and returns the answer as a double. 
        For example, if the array passed contains the values [1, -2, 4, -4, 9, -6, 16, -8, 25, -10], the calculated average should be 2.5. 
        Your method accepts an array of integers as its parameter and returns the average. You may assume that the array contains at least one element. 
        Your method should not modify the elements of the array. */

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?: ");
        int x = input.nextInt();
        int [] arr = new int[x];
        double avg = 0;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            System.out.println();
            System.out.print("Number: ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.printf("Average: %f", avg);
    }
}
