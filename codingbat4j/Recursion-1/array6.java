import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("How long do you want your array to be: ");
        int x = sc.nextInt();
        int index = 0;

        int[] arr = new int[x];

        System.out.println("Fill the array!");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Num: ");
            arr[i] = sc.nextInt();
        }

        System.out.printf("Contains 6: %b", array6(arr, index));
    }

    public static Boolean array6(int[] arr,int index) {

        Boolean flag = false;
        
        if (arr.length == 0) {
            return flag;
        }
        if (arr[index] == 6) {
            index = arr.length-1;
            flag = true;
        } else if (index < arr.length-1) {
            index++;
            flag = array6(arr, index);
        }
        return flag;
    }
}