import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Paragraph: ");
        String str = input.nextLine();
        int uppcase = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                uppcase++;
            }
        }
        System.out.printf("Number of Upper Case Letters: %d", uppcase);
    }
}