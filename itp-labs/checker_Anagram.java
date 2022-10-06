import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("THIS PROGRAM IS CASE SENSITIVE.");
        System.out.print("First Word: ");
        String str1 = input.nextLine();
        System.out.print("Second Word: ");
        String str2 = input.nextLine();
        String subString = "";
        boolean flag = false;
        do {
            if ((str1.length() != str2.length()) || (str1.equals(str2))) {
                System.out.println("The words must have the same number of characters & the words must be distinct. Try Again");
                System.out.println("First Word: ");
                str1 = input.nextLine();
                System.out.println("Second Word: ");
                str2 = input.nextLine();
            }
        } while((str1.length() != str2.length()) || (str1.equals(str2)));

        for (int i = 0; i < str1.length(); i++) {
            subString = "" + str1.charAt(i);
            if (str2.contains(subString)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            subString = "" + str2.charAt(i);
            if (str1.contains(subString)) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE!");
        }














    }
}

