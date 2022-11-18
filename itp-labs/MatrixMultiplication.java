import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int r1, r2, c1, c2;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("R1, C1, R2, C2: ");
            r1 = sc.nextInt();
            c1 = sc.nextInt();
            r2 = sc.nextInt();
            c2 = sc.nextInt();

            if (c1 != r2) {
                System.out.println("Invalid Input. C1 and R2 must be equal");
                System.out.println("Enter Again: ");
            }

        } while (c1 != r2);

        int[][] M1 = new int[r1][c1];
        int[][] M2 = new int[r2][c2];
        int[][] M3 = new int[r1][c2];

        System.out.println("Enter Matrix 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix 2");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                M2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r1; k++) {
                    M3[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }


        System.out.println();
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(M3[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }



    }
}
