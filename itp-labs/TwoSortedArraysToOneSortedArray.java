import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int temp;
        int i;
        int a1;
        int a2;
        int a3;
        i = a1 = a2 = a3 = 0;

        System.out.println("Enter the number of numbers you want to enter in the first array: ");
        int x = sc.nextInt();

        System.out.println("Enter the number of numbers you want to enter in the second array: ");
        int y = sc.nextInt();

        int[] arr1 = new int[x];
        int[] arr2 = new int[y];
        int[] arr3 = new int[x+y];

        for (int j = 0; j < arr1.length; j++) {
            System.out.println("Number in 1st Array: ");
            arr1[j] = sc.nextInt(); 
        }

        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Number in 2nd Array: ");
            arr2[j] = sc.nextInt(); 
        }

        do {
            if (arr1[a1]>arr2[a2]) {
                arr3[a3] = arr2[a2];
                a2++;
                a3++;
            } else if (arr1[a1]<arr2[a2]) {
                arr3[a3] = arr1[a1];
                a1++;
                a3++;
            } else {
                arr3[a3] = arr1[a1];
                arr3[a3+1] = arr2[a2];
                a1++;
                a2++;
                a3+=2;
            }
        } while ((a1 < arr1.length) && (a2 < arr2.length));

        if (a1 == arr1.length) {
            for (int j = a3; j < arr3.length; j++, a2++) {
                arr3[j] =  arr2[a2];
            }
        } else {
            for (int j = a3; j < arr3.length; j++, a1++) {
                arr3[j] =  arr1[a1];
            }
        }
        System.out.println(a1+""+a2+""+a3);
        System.out.println(Arrays.toString(arr3));

    }
}
            