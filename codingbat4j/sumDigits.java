import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        int x = sc.nextInt();

        System.out.println(sumdigits(x));

    }

    public static int sumdigits(int n) {

        int sum;

        if (n < 10) {
            return n;
        } else {
            sum = (n % 10) + sumdigits(n/10); 
            return sum;
            
        }
        
    }
}
