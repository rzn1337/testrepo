import java.util.FormatFlagsConversionMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Write a static method named anglePairs that accepts three angles (integers), measured in degrees, as parameters and returns whether or not there exists both complementary and supplementary angles amongst the three angles passed. 
        Two angles are complementary if their sum is exactly 90 degrees; two angles are supplementary if their sum is exactly 180 degrees. 
        Therefore, the method should return true if any two of the three angles add up to 90 degrees and also any two of the three angles add up to 180 degrees; otherwise the method should return false. 
        You may assume that each angle passed is non-negative. */

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        boolean issupplementary = false;
        boolean iscomplementary = false;
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Angle: ");
            arr[i] = sc.nextInt();
        }
        if ((arr[0] + arr[1]) == 180 || (arr[1] + arr[2]) ==180 || (arr[0] + arr[2]) == 180) {
            issupplementary = true;
        } 
        if ((arr[0] + arr[1]) == 90 || (arr[1] + arr[2]) == 90 || (arr[0] + arr[2]) == 90) {
            iscomplementary = true;
        }
        if (issupplementary == true && iscomplementary == true) {
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE!");
        }
    }
}
