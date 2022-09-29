import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*(Generate vehicle plate numbers) Assume that a vehicle plate number consists
of three uppercase letters followed by four digits. Write a program to generate a
plate number.Format: LLL-DDDD*/
        Scanner input = new Scanner(System.in);
        System.out.println("");
        int x,y,z;
        char ch1, ch2, ch3;

        do {
            x = (int) (Math.random() * 100);
        } while(x<65 || x>90);
        ch1 =  (char) x;
        do {
            y = (int) (Math.random() * 100);
        } while(y<65 || y>90);
        ch2 = (char) y;
        do {
            z = (int) (Math.random() * 100);
        } while(z<65 || z>90);
        ch3 = (char) z;

        int d1 = (int) (Math.random() * 10);
        int d2 = (int) (Math.random() * 10);
        int d3 = (int) (Math.random() * 10);
        int d4 = (int) (Math.random() * 10);

        System.out.printf("Plate Number: %c%c%c-%d%d%d%d", x,y,z,d1,d2,d3,d4);





    }
}