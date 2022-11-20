import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String str = sc.next();

        System.out.printf("Reversed String: %s", strrev(str));

    }

    public static String strrev(String s) {

        String str;

        if (s.length() == 1) {
            return s;
        } else {
            str = s.charAt(s.length()-1) + strrev(s.substring(0,s.length()-1));
            return str;
        }
    }
}
