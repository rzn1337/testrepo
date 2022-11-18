import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter: ");
        int x = sc.nextInt();

        System.out.println(zerox(x));


    }

    public static int zerox(int n) {

        int count = 0;

        if (n == 0) {
            count = 1;
        } else if (n < 10) {
            count = 0;
        } else if (n % 10 == 0) {
            count = zerox(n/10) + 1; 
        } else {
            count = zerox(n/10);
        }
        
        return count;
    }

}
