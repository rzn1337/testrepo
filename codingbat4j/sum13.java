import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Return the sum of the numbers in the array, returning 0 for an empty array. 
        Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count. */

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter?: ");
        int x = input.nextInt();
        int [] arr = new int[x];
        int sum = 0;
        if (x == 0) {
            System.out.println("Empty Array: 0");
        }
        for (int i = 0; i < x; i++) {
            System.out.println();
            System.out.print("Number: ");
            arr[i] = input.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 13) {
                sum += arr[j];
            }
            if (arr[j] == 13) {
                break;
            }            
        }
        System.out.printf("Sum Until 13 = %d", sum);
        
    
    
    
    
    }
}
