import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Amount: ");
        double amount = input.nextDouble();
        int x = (int) amount*100;
        x = x / 100;
        System.out.print("Dollers: "+x);
    }
}