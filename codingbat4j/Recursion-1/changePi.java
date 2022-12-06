package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("String: ");
        String str = sc.next();

        System.out.println(changePi(str));

    }

    public static String changePi(String s) {

        String str = "";

        if (s.length() == 1) {
            return s;
        } else if (s == "pi") {
            return "3.14";
        } else if (s.indexOf("pi") == 0){
            str = "3.14" + changePi(s.substring(2));
        } else if (s.length() > 0) {
            str = s.charAt(0) + changePi(s.substring(1));
        }
        return str;
    }
}
