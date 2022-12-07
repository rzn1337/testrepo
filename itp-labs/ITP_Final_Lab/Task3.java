import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* 
         Write a program to compute the sum and max of numbers in an array using Recursion
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Num:");
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int h = arr[0];

        System.out.println("Max: "+ max(arr, h, i));
        System.out.println("Sum: " + sum(arr, i));
    }
    
    public static int sum(int[] arr, int i) {

        int sum;

        if (i == arr.length-1) {
            return arr[i];
        } else {
            sum = arr[i] + sum(arr,i+1);
        }
        return sum;
    }

    public static int max(int[] arr, int h, int i) {
        
        if (i == arr.length){
            return h;
        } else if (h <= arr[i]) {
            h = arr[i];
            h = max(arr, h, (i+1));
        } else if ((h >= arr[i])) {
            h = max(arr, h, (i+1));
        }
        return h;
    }
}