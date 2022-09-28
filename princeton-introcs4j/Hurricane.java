import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
Write a program Hurricane.java that that takes the wind speed (in miles per hour) as an integer command-line argument
 and prints whether it qualifies as a hurricane, and if so, whether it is a Category 1, 2, 3, 4, or 5 hurricane.
 Below is a table of the wind speeds according to the Saffir-Simpson scale.
 Saffir-Simpson scale: https://www.marinewaypoints.com/marine/wind.shtml*/

        Scanner input = new Scanner(System.in);
        System.out.print("Wind Speed: ");
        int x = input.nextInt();


        if (x>=74 && x<= 95) {
            System.out.println("Category 1");
        } else if (x>95 && x<=110) {
            System.out.println("Category 2");
        } else if (x>110 && x<=130) {
            System.out.println("Category 3");
        } else if (x>130 && x<=155) {
            System.out.println("Category 4");
        } else if (x>155) {
            System.out.println("Category 5");
        } else if (x<74) {
            System.out.println("No Threat!");
        }


    }
}