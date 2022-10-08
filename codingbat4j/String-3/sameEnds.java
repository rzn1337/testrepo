import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("String: ");
        String str = sc.nextLine();
        int x = str.length();
        int a = x/2;
        String temp = "";

        if (x%2 != 0) {
            a = (x/2) + 1;
        }
        for (int i = 0; i < x/2; i++) {
            if (str.charAt(i) == str.charAt(a)) {
                temp += str.charAt(a);
            }
            if (a != x-1) {
                a++;
            }
        }
        if (temp.length() == 0) {
            System.out.println("String has no sameEnds");
        } else {
            System.out.println(temp);
        }
    }
}
