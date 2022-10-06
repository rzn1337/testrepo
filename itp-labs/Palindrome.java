/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 4-digit number: ");
        int num = input.nextInt();
        
        int d1 = num%10;
        int d2 = (num/10)%10;
        int d3 = (num/100)%10;
        int d4 = (num/1000);
        
        int x=  d1*1000;
        int y= d2*100;
        int z = d3*10;
        
        int reversenum = x+y+z+d4;
        
        if (num == reversenum) {
            System.out.println("The number is a PALINDROME"); 
        }
        else
        {
            System.out.println("The number is not a PALINDROME");
        }
          
           
     
        
        
        
    }
    
}
