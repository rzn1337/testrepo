import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

    }

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
