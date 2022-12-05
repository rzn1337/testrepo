import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
                
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number followed by the exponent: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(powerN(x, y));
    }

    public static int powerN(int x, int y) {

        int answer;

        if (y == 1) {
            return x; 
        } else {
            answer = x * powerN(x, y-1);
        }
        return answer;
    }
}
