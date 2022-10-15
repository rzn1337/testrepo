import java.util.*;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        /*System takes an input of a  denary number and prints out the Hexadecimal, Binary, and Octal Equivalents  */
        Scanner input = new Scanner(System.in);
        System.out.print("Denary Number: ");
        int num = input.nextInt();
        int n = num;
        String temp = "";
        String hex = "";
        String oct = "";
        String bin = "";
        int x,y;

        // 2Bin

        do {
            y = n%2;
            n = n/2;
            temp += y;
        } while (n>=1);

        for (int i = temp.length()-1; i >= 0; i--) {
            bin += temp.charAt(i);
        }

        System.out.printf("Binary : %s", bin);

        System.out.println();
        
        temp = "";
        n = num;

        // 2Oct

        do {
            y = n%8;
            n = n/8;
            temp += y;
        } while (n>7);

        temp += n;

        for (int i = temp.length()-1; i >= 0; i--) {
            oct += temp.charAt(i);
        }

        System.out.printf("Octal: %s", oct);
       
        System.out.println();

        temp = "";
        n = num;

        // 2Hex

        do {
            y = n%16;
            n = n/16;
            switch (y) {
                case 10 : temp += 'A';
                            break;
                case 11 : temp += 'B';
                            break;
                case 12 : temp += 'C';
                            break;
                case 13 : temp += 'D';
                            break;
                case 14 : temp += 'E';
                            break;
                case 15 : temp += 'F';
                            break;
                default: temp += y;
            }
        } while (n>=16);

        switch (n) {
            case 10 : temp += 'A';
                        break;
            case 11 : temp += 'B';
                        break;
            case 12 : temp += 'C';
                        break;
            case 13 : temp += 'D';
                        break;
            case 14 : temp += 'E';
                        break;
            case 15 : temp += 'F';
                        break;
            default: temp += n;
        }

        for (int i = temp.length()-1; i >= 0; i--) {
            hex += temp.charAt(i);
        }

        System.out.printf("Hexadecimal: %s", hex);    
    }

}
