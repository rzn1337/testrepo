package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int x = sc.nextInt();

        int[] scores = new int[x];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Num: ");
            scores[i] = sc.nextInt();
        }

        System.out.println(scoresIncreasing(scores));
    }
    public static Boolean scoresIncreasing(int[] scores) {

        Boolean flag = true;

        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i] <= scores[i+1]) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
