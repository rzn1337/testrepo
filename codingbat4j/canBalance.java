import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How long do you want your array to be: ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        System.out.println("Fill the array!");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Num: ");
            arr[i] = sc.nextInt();
        }

        System.out.printf("canBalance: %b", canBalance(arr));
        
    }

    public static Boolean canBalance(int[] nums) {

        int x = 0; int y = 0; Boolean balanced = false;

        x = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            y += nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            if (x == y) {
                balanced = true;
                break;
            } else {
                x += nums[i];
                y -= nums[i];
            }
        }
        return balanced;
    }
}
