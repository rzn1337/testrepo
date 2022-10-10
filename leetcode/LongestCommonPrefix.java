import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        System.out.print("How many words do you want to enter: ");
        int x = input.nextInt();
        String[] str = new String[x];
        boolean flag = false;
        char ch;
        String temp = "";
        int count = 0;
        int min;
        boolean mismatch = false;

        for (int k = 0; k < str.length; k++) {
            System.out.print("Word: ");
            str[k] = input.next();
        }
        min = str[0].length();

        for (int z = 1; z < str.length; z++) {
            min = Math.min(min, str[z].length());
        }
        for (int j = 0; j < min; j++) {
            for (int i = 0; i < str.length; i++) {
                ch = str[0].charAt(j);
                if (i+1 < str.length) {
                    if (str[i+1].charAt(j) == ch) {
                        flag = true;
                    } else {
                        mismatch = true;
                        break;
                    }
                }
            }
            if (flag && !mismatch) {
                count += 1;
            }
            if (mismatch) {
                break;
            }
        }
            for (int l = 0; l < count; l++) {
                temp +=  str[0].charAt(l);
            }
        if (flag) {
            System.out.println(temp);
        } else if (mismatch) {
            System.out.println("LCP does not exist!");
        }
     }
}
