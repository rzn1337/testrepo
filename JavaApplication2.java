/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number of Lines: ");
        
        int sum = 0;
        
        int x = input.nextInt();
        
        for(int i = 1; i <= x ; i++){
            
            sum = 0;
            
            for (int j=1; j<=i; j++){
                
                sum = sum + j;
                 System.out.print(j + "");
                
                
                if (i==j){
                continue;
                }
                System.out.print("+");
               

            }   
            
            System.out.println("=" + sum);
            System.out.println();
                
                
           
            
            
            
        
        
        
       
        
    }
    }
    
}
