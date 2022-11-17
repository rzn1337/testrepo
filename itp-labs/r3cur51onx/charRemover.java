package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        String str = sc.next();
        System.out.println(removex(str));
    }

    public static String removex(String str) {

        if (str.length()==1) {
            if (str.charAt(0) == 'x') {
                return "";
            } else {
                return str;
            }
        }
        if (str.charAt(0) == 'x') {
            return removex(str.substring(1));
        } else {
            return str.charAt(0) + removex(str.substring(1));
        }
    }
}
