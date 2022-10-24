import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*A Caesar cipher is a simple encryption where a message is encoded by shifting each letter by a given amount.
	    e.g. with a shift of 3,   A  D,  H  K,  X  A,  and Z  C
        Write a program that reads a message from the user and performs a Caesar cipher on its letters:
        Your secret message: Brad thinks Angelina is cute
        Your secret key: 3
        The encoded message: eudg wklqnv dqjholqd lv fxwh
        */

        Scanner input = new Scanner(System.in);

        char x;
        int z;

        
        String newtxt = "";

        System.out.print("Text: ");
        String txt = input.nextLine();
        System.out.println("The key must not be greater than 26");
        System.out.print("Key: ");
        int key = input.nextInt();

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == ' ') {
                newtxt += ' ';
                continue;
            }
            if (122 - txt.charAt(i) < key) {
            if (Character.isLowerCase(txt.charAt(i))) {
            z = 97+key-(122-txt.charAt(i))-1;
            x = (char) z;
            newtxt += x;
            } else {
                z = 65+key-(90-txt.charAt(i))-1;
                x = (char) z;
                newtxt += x;
            }
        }else {
            if (Character.isLowerCase(txt.charAt(i))) {
                z = txt.charAt(i) + key;
                x = (char) z;
                newtxt += x;
                } else {
                    z = txt.charAt(i) + key;
                    x = (char) z;
                    newtxt += x;
                }
        }
        }
        System.out.println(newtxt);
    }
}
