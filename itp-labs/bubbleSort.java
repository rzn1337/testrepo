import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int temp;
        int k;

        System.out.println("Enter the number of numbers you want to sort: ");
        int x = sc.nextInt();

        int[] nums = new int[x];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Number: ");
            nums[i] = sc.nextInt(); 
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(nums));

    }
}
            
