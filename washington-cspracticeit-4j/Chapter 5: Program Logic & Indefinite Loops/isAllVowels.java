import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        /*Write a method named isAllVowels that returns whether a String consists entirely of vowels (a, e, i, o, or u, case-insensitively). If every character of the String is a vowel, your method should return true. If any character of the String is a non-vowel, your method should return false. 
        Your method should return true if passed the empty string, since it does not contain any non-vowel characters. */
        
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String str = sc.nextLine();
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE!");
        }
    }
}
