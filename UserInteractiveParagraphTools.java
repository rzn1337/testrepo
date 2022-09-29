package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a = "";
        String b = "";
        int opt = 0;
        char ch;

        do {
            System.out.print("Enter your Paragraph: ");
            String str = input.nextLine();

            System.out.print("Find & Replace(0), Word Counter(1), Sentence Counter(2), Articles(3), Spaces(4): ");
            int option = input.nextInt();
            if (option == 0) {
                System.out.print("ReplaceOneByOne(0), ReplaceAll(1): ");
                opt = input.nextInt();
                System.out.print("Replace: ");
                a = input.next();
                System.out.print("By: ");
                b = input.next();
            }
            if (option == 3) {
                System.out.println("a(0), an(1), the(2)");
                opt = input.nextInt();
            }
            switch (option) {
                case 0:
                    if (opt == 0) {
                        System.out.println(str.replaceFirst(a, b));
                    } else
                        System.out.println(str.replaceAll(a, b));
                    break;
                case 1:
                    String[] tokens = str.split(" ");
                    System.out.println("Word Count: " + tokens.length);
                    break;
                case 2:
                    String[] tokens1 = str.split("\\.");
                    System.out.println("Sentence Count: " + tokens1.length);
                    break;
                case 3:
                    if (opt == 0) {
                        String[] tokens2 = str.split(" a ");
                        System.out.println("Count: " + ((tokens2.length) - 1));
                    } else if (opt == 1) {
                        String[] tokens3 = str.split(" an ");
                        System.out.println("Count: " + ((tokens3.length) - 1));
                    } else if (opt == 2) {
                        String[] tokens4 = str.split(" the ");
                        System.out.println("Count: " + ((tokens4.length) - 1));
                    }
                    break;
                case 4:
                    String[] tokens5 = str.split(" ");
                    System.out.println("Space Count: " + ((tokens5.length) - 1));
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.exit(1);
            }
            System.out.println("Continue(Y), Exit(N)");
            ch = input.next().charAt(0);

            input.nextLine();
        } while( (ch == 'y') || (ch == 'Y') );










































    }
}
