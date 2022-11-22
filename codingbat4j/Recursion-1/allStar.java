import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("String: ");
        String str = sc.next();

        System.out.println(allstar(str));

    }

    public static String allstar(String s) {

        String str;

        if (s.length() == 0) {
            return s;
        } if (s.length() == 1) {
            return s;
        } else {
            str = s.charAt(0) + "*" + allstar(s.substring(1));
        }
        return str;
    }
}
