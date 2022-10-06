import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the value of x: ");
        int x = input.nextInt();

        System.out.print("Enter the value of y: ");
        int y = input.nextInt();

        double z=Math.pow(x,2)+Math.pow(y,2);

        System.out.println("The Euclidean distance is: " + Math.sqrt(z) );
    }
}