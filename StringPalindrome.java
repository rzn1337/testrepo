package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        boolean flag = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Word: ");
        String str = input.next();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                flag = true;
            } else {
                flag = false;
                break;
            }

        }

        if (flag) {
            System.out.println("PALINDROME!");
        } else
            System.out.println("NOT A PALINDROME!");
    }

        /* Alt Code Logic:
        for (int i = 0; i < (str.length())/2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                System.out.println("NOT A PALINDROME!");
                break;
            }
        }

        if (flag) {
            System.out.println("PALINDROME!");
         */
}