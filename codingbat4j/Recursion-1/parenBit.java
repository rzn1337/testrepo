import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("String: ");
        String str = sc.next();

        System.out.println(paren(str));

    }

    public static String paren(String s){

        String str = "";

        if (s.charAt(0) == '(' && s.charAt(s.length()-1) == ')') {
            return s;
        } else if (s.charAt(0) != '(' && s.charAt(s.length()-1) == ')') {
            str = paren(s.substring(1));
        } else if (s.charAt(0) == '(' && s.charAt(s.length()-1) != ')') {
            str = paren(s.substring(0,s.length()-1));
        } else {
            str = paren(s.substring(1));
        }
        return str;
}
}
