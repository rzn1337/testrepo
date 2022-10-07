import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*Write a method called max that accepts an array of integers as a parameter and returns the maximum value in the array. 
        For example, if the array passed stores {12, 7, -1, 25, 3, 9}, your method should return 25. 
        You may assume that the array contains at least one element. 
        Your method should not modify the elements of the array. */

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter?: ");
        int x = input.nextInt();
        int [] arr = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println();
            System.out.print("Number: ");
            arr[i] = input.nextInt();
        }
        int highest = arr[0];
        for (int j = 0; j < x; j++) {
            if (arr[j] > highest) {
                highest = arr[j];
            }
        }
        System.out.printf("Max: %d", highest);





    }
}
