import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. 
        Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. 
        Integer.parseInt(string) converts a string to an int.) */

        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String str = sc.nextLine();
        int sum = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp = "" + str.charAt(i);
                sum += Integer.parseInt(temp);
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
