import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Term: ");
        int term = sc.nextInt();

        int answer = fib(term);
        System.out.println(answer);
    }

    public static int fib(int n) {
        
        int term = 0;

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        term += fib(n-1) + fib(n-2);
        return term;

    }
}
