import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int loc1 = 0;
        int loc2 = 0;
        boolean found = false;

        System.out.print("How many numbers do you want to enter?: ");
        int x = sc.nextInt();

        System.out.print("Target: ");
        int target = sc.nextInt();

        int[] num = new int[x];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Number: ");
            num[i] = sc.nextInt();
        }

        for (int j = 0; j < num.length-1; j++) {
            for (int k = j+1; k < num.length; k++) {
                if (num[k] + num[j] == target) {
                    loc1 = j;
                    loc2 = k;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.println();
        System.out.printf("Indices: [%d, %d]", loc1, loc2);
    }
}
