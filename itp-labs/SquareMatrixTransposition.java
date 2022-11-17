import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int r1, c1;

        Scanner sc = new Scanner(System.in);


            System.out.print("R1, C1 : ");
            r1 = sc.nextInt();
            c1 = sc.nextInt();

            if (c1 != r1) {
                System.out.println("Invalid Input. C1 and R2 must be equal");
                System.out.println("Enter Again: ");
                System.exit(0);
            }

        int[][] m47r1x = new int[r1][c1];

        System.out.println("Enter your Matrix ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m47r1x[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m47r1x[j][i] + " ");
            }
            System.out.println();
        }

        
        

















    }
}
