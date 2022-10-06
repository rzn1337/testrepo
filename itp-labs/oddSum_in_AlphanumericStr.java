import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Alphanumeric String: ");
            String str = input.nextLine();
            String numstr = "";
            int x;
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    numstr = numstr + str.charAt(i);
                }
                if (((i != 0) && (i != (str.length()-1))) && ((Character.isDigit(str.charAt(i)))) && ((Character.isDigit(str.charAt(i+1))) == false)) {
                    numstr = numstr + ".";
                }
                if (((i != 0) && (i != (str.length()-1))) && ((Character.isDigit(str.charAt(i))) == false) && ((Character.isDigit(str.charAt(i+1))))) {
                    numstr = numstr + ".";
                }
                if (((i != 0) && (i != (str.length()-1))) && ((Character.isDigit(str.charAt(i))) == false) && ((Character.isDigit(str.charAt(i-1)))) && ((Character.isDigit(str.charAt(i+1))))) {
                    numstr = numstr + ".";
                }
            }
            String[] arr = numstr.split("\\.");
            int arrlength = arr.length;

            for (int j = 0; j < arrlength; j++) {
                String str1 = arr[j];
                if (arr[j] != "") {
                    if ((str1.charAt(0) >= '0') && (str1.charAt(0) <= '9')) {
                        x = Integer.parseInt(str1);
                        if ((x % 2) != 0) {
                            sum = sum + x;
                        }
                    }
                }
            }
            System.out.println(sum);     
        }
    }
    
}



