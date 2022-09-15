/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
            
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
           
        int gcd = 1;
        
        int z = 2;           
        
        while (num1>z && num2>z) {
            
        if (num1%z==0 && num2%z==0){
            
               gcd = z;  
            }
        
        z++;
        
        }
        
        System.out.println("GCD: " + gcd);
             
                      
              
            
            
            
           
        
        
    }
    
}
