package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);

	 System.out.print("Enter the Hex Digit: ");

	 char ch = input.next().charAt(0);

	 if (ch>= 48 && ch<= 57)
         System.out.printf("Number in Decimal System: %c", ch);

	 if (ch>= 65 && ch<= 70 )
         System.out.print("Number in Decimal System: " + (ch-55));


	 /* Alt Code:
	 if (ch>= '0' && ch<= '9')
         System.out.printf("Number in Decimal System: %c", ch);

	 if (ch>= 'A' && ch<= 'F')
         System.out.print("Number in Decimal System: " + (ch-55));
	  */































    }

}
