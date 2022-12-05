import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Row: ");
        int x = sc.nextInt();
        

        System.out.println(triangle(x));
    }

    public static int triangle(int x) {

        int sum;

        if (x == 0) {
            return 0;
        } else if (x == 1) {
            return 1;
        } else {
            sum = x + triangle(x-1);
        }
        
        return sum;
    }
}
