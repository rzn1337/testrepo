import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*3.17:(Game: scissor, rock, paper) Write a program that plays the popular scissor–
rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
a paper can wrap a rock.) The program randomly generates a number 0, 1, or
2 representing scissor, rock, and paper. The program prompts the user to enter
a number 0, 1, or 2 and displays a message indicating whether the user or the
computer wins, loses, or draws.
        Programming Exercise 3.17 gives a program that
plays the scissor–rock–paper game. Revise the program to let the user continuously
play until either the user or the computer wins more than two times than its
opponent.*/

        Scanner input = new Scanner(System.in);

        int x, y;
        int a = 0;
        int b = 0;

        do {

            do {
                x = (int) (Math.random() * 10);
            } while (x > 2);
            System.out.println(x);

            do {
                System.out.print("Rock(0), Paper(1), Scissor(2): ");
                y = input.nextInt();
            } while (y > 2);

            switch (x) {
                case 0:
                    if (y == 0) {
                        System.out.println("Game Tied!");
                    }
                    else if (y == 1) {
                        System.out.println("You Won!");
                        a++;
                    } else {
                        System.out.println("You Lost!");
                        b++;
                    }
                    break;
                case 1:
                    if (y == 0) {
                        System.out.println("You Lost!");
                        b++;
                    } else if (y == 1) {
                        System.out.println("Game Tied!");
                    } else {
                        System.out.println("You Won!");
                        a++;
                    }
                    break;
                default:
                    if (y == 0) {
                        System.out.println("You Won!");
                        a++;
                    } else if (y == 1) {
                        System.out.println("You Lost!");
                        b++;
                    } else {
                        System.out.println("Game Tied");
                    }
            }

        } while((a<2) && (b<2));

        System.out.println("End!");

        System.exit(0);

    }
}












       
































