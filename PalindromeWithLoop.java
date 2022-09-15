/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromewithloop;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class PalindromeWithLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter your number: ");
        
        int num = input.nextInt();
        int original = num;  
        while (num!=0){
        int x = num % 10;
        num = num/10;
        rev = (rev*10) + x;
        }
    if (rev==original){
        System.out.println("The number is a palindrome!");
    }else{
        System.out.println("The number is not a palindrome!");
    }
    
    
    
    
    }
    
    
    
}
