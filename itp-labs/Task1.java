import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         Write a program to search for the "saddle Points" in a 3 by 3 array of integers.
         A saddle point is a cell whose value is less than or equal to any in its row, and greater than or equal to any in its column.
         There may be more than one saddle point in the array. Print out "No saddle points" if there are none.
         Eg:
         --> Input:
         20 30 40 
         56 78 45
         1  2  3
         --> Output: 
         The saddle point is 45 and its position is row2, column3.
         */

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        int saddlepointcount = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Number: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                int rowmin = Math.min(arr[i][0], Math.min(arr[i][2], arr[i][2]));
                int colmax = Math.max(arr[0][j], Math.max(arr[1][j], arr[2][j]));
                
                if ((rowmin == colmax) && (rowmin == arr[i][j]) ) {
                    System.out.println("Saddle Point: " + arr[i][j] + ", Row: "+(i+1)+", Column: "+(j+1));
                    saddlepointcount++;
                }

            }
        }
        if (saddlepointcount == 0) {
            System.out.println("No Saddle Points found!");
        }
    }
}

/*
 if (j == 0) {
                    if (arr[i][j] <= arr[i][j+1]) {
                        System.out.println("Saddle Point: " + arr[i][j] + ", Row: "+(i+1)+", Column: "+(j+1));
                    }
                    if (arr[i][j] <= arr[i][j+2]) {
                        System.out.println("Saddle Point: " + arr[i][j] + ", Row: "+(i+1)+", Column: "+(j+1));
                    }
                }

                if (j == 1) {
                    if (arr[i][j] <= arr[i][j-1]) {
                        System.out.println("Saddle Point: " + arr[i][j] + ", Row: "+(i+1)+", Column: "+(j+1));
                    }
                    if (arr[i][j] <= arr[i][j+1]) {
                        System.out.println("Saddle Point: " + arr[i][j] + ", Row: "+(i+1)+", Column: "+(j+1));
                    }
                }

                if (j == 2) {
                    if (arr[i][j] <= arr[i][j-1]) {
                        System.out.println("Saddle Point: " + arr[i][j] + ", Row: "+(i+1)+", Column: "+(j+1));
                    }
                    if (arr[i][j] <= arr[i][j-2]) {
                        System.out.println("Saddle Point: " + arr[i][j] + ", Row: "+(i+1)+", Column: "+(j+1));
                    }
                }

 */
