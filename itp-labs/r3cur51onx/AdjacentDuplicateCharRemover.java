import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String str = sc.next();

        System.out.printf("New String: %s", dupremover(str));
    
    }

    public static String dupremover(String s) {

        String str = "";

        if (s.length() == 0) {
            return s;
        } else {
            str = s.charAt(0) + dupremover(s.substring((s.lastIndexOf(s.charAt(0)))+1));  
        }
        return str;
        
    }
    
}
