import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        /*Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
        Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.*/

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter?: ");
        int x = input.nextInt();
        int [] arr = new int[x];
        int diff = 0;

        for (int i = 0; i < x; i++) {
            System.out.println();
            System.out.print("Number: ");
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int j = 0; j < arr.length; j++) {
            int y = Math.max(arr[j], max);
            if (y == arr[j]) {
                max = arr[j];
            }
        }
        for (int k = 0; k < arr.length; k++) {
            int z = Math.min(arr[k], min);
            if (z == arr[k]) {
                min = arr[k];
            }
        }
        diff = max - min;
        System.out.printf("Difference b/w Max & Min: %d", diff);


    
 

    
    
    
    
    
    
    
    }
}
