import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("String: ");
        String str = sc.next();

        System.out.println(changexy(str));
        
    }

    public static String changexy(String s) {

        String str = "";

        if (s.length() == 1 && s.charAt(0) == 'x') {                // Why doesnt the code work when s.charAt(0) == 'x' is replaced by s == "x"
            return "y";
        } else if (s.length() == 1 && s != "x")  {
            return s;
        } else if (s.length() > 1) {
            if (s.charAt(0) == 'x') {
                str += 'y' + changexy(s.substring(1));
            } else {
                str += s.charAt(0) + changexy(s.substring(1));
            }
        }
        return str;
    }
}
