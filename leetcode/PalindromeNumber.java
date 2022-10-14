import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        String num = input.next();
        boolean palindrome = false;

        for (int i = 0; i < (num.length()/2); i++) {
            if ((num.charAt(i)) == (num.charAt(num.length()-1-i))) {
                palindrome = true;
            } else {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
    }
}
