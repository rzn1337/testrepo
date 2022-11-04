import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Number of numbers: ");
        int x = input.nextInt();

        int[] nums = new int[x+1];                                                 

        int i,j;
        boolean exception = true;;

        System.out.println("Enter the numbers in ascending order: ");           
       
        for (i = 0; i < nums.length-1; i++) {   
            nums[i] = input.nextInt();
        }

        System.out.print("Insert: ");
        int insert = input.nextInt();

        for (i = 0; i < nums.length; i++) {
            
            if (nums[i] > insert){
                exception = false;
                break;
            }   
        }

        if (exception) {
            i--;
        }

        for (j = nums.length-1; j > i ; j--) {
            
            if (i == nums.length) {
                exception = true;
                break;
            }
            nums[j] = nums[j-1];
        }

        nums[i] = insert;

        System.out.println("Sorted Insertion: ");

        for (int k : nums) {
            System.out.println(k);
        }
    }
}
