import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        boolean found1 = false, found2 = false, found3 = false;

        // x Creation

        int[][] board; 

        int[] pos = new int[2];
        
        int num;

        int a,b;

        boolean boardfull = false;

        board = fixedpos();
        
        int[][] referenceboard = new int[9][9];


    for (int i = 0; i < referenceboard.length; i++) {

        for (int j = 0; j < referenceboard.length; j++) {
            if (board[i][j] != 0) {
            referenceboard[i][j] = -1;
            }
        }
    }

do {
                                                                         
    System.out.println();                                               /*Convoluted GFX Design Implemented by a Maven.*/
    System.out.print("---------------------------"); 

    printboard(board.length, board);

    System.out.println("---------------------------");

   

    do {

             pos = positioninput(referenceboard);

    a = pos[0];

    b = pos[1];


            System.out.println("Number: ");
            num = sc.nextInt();

            
            while (num <= 0 || num > 9 ) {
                System.out.println("Number must be > 0 and < 10. Try Again");
                System.out.println("Number: ");
                num = sc.nextInt();

                
            }

            found1 = rowcheck(a, board, num);

            found2 = columncheck(b, board, num);

            found3 = threebythreecheck(a, b, board, num);

            if (found1) {
            System.out.println("Number already in the row");
            }

            if (found2) {
            System.out.println("Number already in the column");
            }

            if (found3) {
            System.out.println("Number already in 3x3");
            }

            if (found1 || found2 || found3) {
            System.out.println("Enter the Number again: ");
            continue;
            }

            System.out.println();

    } while (found1 || found2 || found3);


    board[a][b] = num;

    boardfull = boardfullchecker(board);

} while (!boardfull);

if (boardfull) {
    System.out.println("You have successfully completed the game.");
}

System.out.println();                                                      /*Convoluted GFX Design Implemented by a Maven.*/
    System.out.print("---------------------------"); 

    printboard(board.length, board);

    System.out.println("---------------------------");




System.exit(0);
 
}

    public static int[][] fixedpos() {

        int[][] x = new int[9][9];

        x[0][0] = 5;
        x[0][1] = 3;
        x[0][4] = 7;
        x[1][0] = 6;
        x[1][3] = 1;
        x[1][4] = 9;
        x[1][5] = 5;
        x[2][1] = 9;
        x[2][2] = 8;
        x[2][7] = 6;
        x[3][0] = 8;
        x[3][4] = 6;
        x[3][8] = 3;
        x[4][0] = 4;
        x[4][3] = 8;
        x[4][5] = 3;
        x[4][8] = 1;
        x[5][0] = 7;
        x[5][4] = 2;
        x[5][8] = 6;
        x[6][1] = 6;
        x[7][3] = 4;
        x[7][4] = 1;
        x[7][5] = 9;
        x[7][8] = 5;
        x[8][4] = 8;
        x[8][7] = 7;
        x[8][8] = 9;

        return x;
    }
    


    public static boolean rowcheck(int a, int[][] x, int number) {
        
        boolean foundinrow = false;

        for (int i = 0; i < 9; i++) {
            if (x[a][i] == number) {
                foundinrow = true;
                break;
            }
        }

        return foundinrow;
    }

    public static boolean columncheck(int b, int[][] x, int number) {

        boolean foundincol = false;

        for (int i = 0; i < 9; i++) {
            if (x[i][b] == number) {
                foundincol = true;
                break;
            }
        }

        return foundincol;
    
    }

    public static int[] positioninput(int[][] referenceboard) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the position you want to enter the num at (a,b) : ");

            System.out.println("Position 'a': ");
            int a = sc.nextInt();

            System.out.println("Position 'b': ");
            int b = sc.nextInt();

            while ((a < 0) || (a > 8) || (b < 0) || (b > 8)) {

                System.out.println("Position cannot be less than 0 or greater than 8. Try Again.");
                
                System.out.println("Position 'a': ");
                a = sc.nextInt();

                System.out.println("Position 'b': ");
                b = sc.nextInt();

            }

            while (referenceboard[a][b] == -1) {

            

                System.out.println("You cannot overwrite the hardcoded values. Try another position");
                
                System.out.println("Position 'a': ");
                a = sc.nextInt();

                System.out.println("Position 'b': ");
                b = sc.nextInt();

            
        }

      return new int[] {a,b};
    }

    public static boolean threebythreecheck(int a, int b, int[][] x, int number) {
        
        boolean foundin3x3 = false;

        for (int i = ((a/3) + 2*(a/3)); i < ((a/3) + 2*(a/3)) + 3; i++) {

            for (int j = ((b/3) + 2*(b/3)); j < ((b/3) + 2*(b/3)) + 3; j++) {

                if (x[i][j] == number) {
                    foundin3x3 = true;
                    break;
                } 
                
            }

            if (foundin3x3) {
                break;
            } 
        }

        return foundin3x3;
    }

    public static void printboard(int boardlength, int[][] board) {

        int d = 0;
        int c = 0;
        
        for (int i = 0; i < board.length; i++) {
            c = 0; 
            ++d;
            if ( d == 4 || d==7 || d==10 ) {

                for (int j = 0; j < 27; j++) {
                    
                    System.out.print("-");  
                    
                }
                
            }

            System.out.println();

            for (int j = 0; j < board.length; j++) {
                System.out.print(" ");
                if (c == 3 || c == 6 || c == 0 ) {
                    System.out.print("|");
                    System.out.print(" ");
                }
                System.out.print(board[i][j]);
                ++c;
                if (c == 9) {
                    System.out.print(" ");
                    System.out.print("|");
                    
                    
                }
                
            }

            System.out.println();

            
            
        }

    }

    public static boolean boardfullchecker(int[][] board) {

        boolean isfull = false;
        int zerocount = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    zerocount++;
                }
            }
            if (zerocount > 0) {
                isfull = false;
            } else if (zerocount == 0)
                isfull = true;
        }

        return isfull;
        
    }
}








