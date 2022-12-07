import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         Given a string, return the longest substring that appears at the beginning and end of the string without overlapping.
         Eg:
         --> Input:
         sameEnds("abXab") --> "ab"
         sameEnds("abXYab") --> "ab"
         sameEnds("xx") --> "x"
         sameEnds("xxx") --> "x"
         */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("String: ");
        String str = sc.next();
        
        int a = str.lastIndexOf(str.charAt(0));
        int i = 0;
        Boolean flag = true;

        String s = "";

        do {
            if (str.charAt(i) == str.charAt(a)) {
                s += str.charAt(i);
            } else {
                flag = false;
                break;
            }
            i++;
            a++;
        } while (a < str.length());

        if (!flag) {
            System.out.println("No sameEnds founds");
        } else {
            System.out.println(s);
        }
        
    }
}