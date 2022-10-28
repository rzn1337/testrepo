import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int temp;

        System.out.println("Enter the number of numbers you want to sort: ");
        int x = sc.nextInt();

        int[] nums = new int[x];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Number: ");
            nums[i] = sc.nextInt(); 
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length  ; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(nums));

    }
}
            