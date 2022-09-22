/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author 26906
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lines: ");
        int x = input.nextInt();
        int k = 1;
        
        for (int i=1; i<=x; i++) {
            
            for(int j = x-i; j>=0;j-- ){
            System.out.print(" ");
            }
            
            for (k = 1; k<=i; k++)  {
                System.out.print(k); 
            }
             
            for (int l = i-1; l > 0  ; l--) {
                System.out.print(l);
                
           
            }
        System.out.println();
            
        }
        
        
    }
}

    

