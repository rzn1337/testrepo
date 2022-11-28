import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[6][7];                                                    // Declarations &Initializations from line 7 till 13.
        char[][] referenceboard = new char[6][7];
        int count = 0;
        char rory;
        int x = 0;
        int col;
        boolean won, correctinput;
        correctinput = true;
        

        for (int i = 0; i < board.length; i++) {                                            // Filling up the board with '-'s.
            for (int j = 0; j < 7; j++) {
                board[i][j] = '-';                
            }
        }

        int a = 20;

        for (int i = 0; i < referenceboard.length; i++) {                                   //Filling up the reference board with random characters. Used for checks later in the code.
            for (int j = 0; j < 7; j++) {                                                       
                referenceboard[i][j] = (char) a; 
                a++;
            }
            a++;
        }

        prntboard(board);

        do {
            System.out.print(ANSI_GREEN + "Column Number (1-7): " + ANSI_WHITE);            // Column Input & Exception Handling.        
            do {

                try {
                    x = sc.nextInt();
                    correctinput = false;
            } catch (InputMismatchException e) {
                System.out.print("Input has to be a number between 1 and 7: ");
                sc.nextLine();
            }
            } while (correctinput);
            correctinput = true;
            while (x < 1 || x > 7) {
                System.out.println("Only Seven Columns Exist!");
                System.out.print(ANSI_GREEN + "Column Number (1-7): " + ANSI_WHITE);
                do {
                    try {
                        x = sc.nextInt();
                        correctinput = false;
                } catch (InputMismatchException e) {
                    System.out.println("Input has to be a number between 1 and 7");
                    sc.nextLine();
                }
                } while (correctinput);
            }
            col = x-1;
            System.out.println();
            System.out.print(ANSI_RED + "R" + ANSI_WHITE + " / " + ANSI_YELLOW + "Y" + ANSI_WHITE + ": " + ANSI_RESET);              // Disc Input.
            rory = sc.next().charAt(0);
            while ((rory != 'R') && (rory != 'Y')) {
                System.out.println();
                System.out.print(ANSI_GREEN + "RedDisc(R),YellowDisc(Y) " + ANSI_WHITE);
                System.out.println();
                System.out.print(ANSI_RED + "R" + ANSI_WHITE + " / " + ANSI_YELLOW + "Y" + ANSI_WHITE + ": " + ANSI_RESET);
                rory = sc.next().charAt(0);
            }
            board = discadder(rory, col, board);
            referenceboard = discadder(rory, col, referenceboard);
            boolean vert = false, hor = false, diag1 = false, diag2 = false;
            vert = vertchecker(referenceboard);
            hor = horizchecker(referenceboard);
            diag1 = diagchecker1(referenceboard);
            diag2 = diagchecker2(referenceboard);
            prntboard(board);
            if (vert || hor || diag1 || diag2) {
                won = true;
                break;
            } else {
                won = false;
            }
            count++;
        } while(count < 42); 
        if (!won) {
            System.out.println("Game Tied!");
        } else if (rory == 'R') {
            System.out.println("Player " + ANSI_RED +"Red" +ANSI_WHITE+" Won!");
        } else {
            System.out.println("Player " + ANSI_YELLOW +"Yellow" +ANSI_WHITE+" Won!");
        }
        System.exit(0);
    }

    public static char[][] discadder(char rory, int col, char[][] board) {

        for (int i = 5; i > -1 ; i--) {
            if (board[i][col] == 'R' || board[i][col] == 'Y') {
                continue;
            } else {
                board[i][col] = rory;
                break;
            }
        }
        return board;   
        }
    
    public static void prntboard(char[][] board) {

        

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == 'R') {
                    System.out.print(ANSI_RED + board[i][j] + ANSI_WHITE);
                } else if (board[i][j] == 'Y') {
                    System.out.print(ANSI_YELLOW + board[i][j] + ANSI_WHITE);
                } else {
                    System.out.print(board[i][j]);
                }
                System.out.print("   ");
            }
            System.out.println();
            System.out.println();
            
        }
    }

    public static boolean vertchecker(char[][] board){

        boolean flag = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) { 
                if((board[i][j] == board[i+1][j]) && (board[i+1][j] == board[i+2][j]) && (board[i+2][j] == board[i+3][j])) {
                    flag = true;
                    break;
                }           
            }
            if (flag) {
                break;
            }     
        }
        return flag;
    }

    public static boolean horizchecker(char[][] board){

        boolean flag = false;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) { 
                if((board[i][j] == board[i][j+1]) && (board[i][j+1] == board[i][j+2]) && (board[i][j+2] == board[i][j+3])) {
                    flag = true;
                    break;
                }             
            }
            if (flag) {
                break;
            }   
        }
        return flag;
    }

    public static boolean diagchecker1(char[][] board){
        
        boolean flag = false;

        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if ((board[i][j] == board[i-1][j+1]) && (board[i-1][j+1] == board[i-2][j+2]) && (board[i-2][j+2] == board[i-3][j+3])) {
                    flag = true;
                    break;
                }
            }  
            if (flag) {
                break;
            }   
        }
        return flag;
    }

    public static boolean diagchecker2(char[][] board){

        boolean flag = false;

        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 7; j++) {
                if ((board[i][j] == board[i-1][j-1]) && (board[i-1][j-1] == board[i-2][j-2]) && (board[i-2][j-2] == board[i-3][j-3])) {
                    flag = true;
                    break;
                }
            }  
            if (flag) {
                break;
            }   
        }
        return flag;
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31;1m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33;1m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
